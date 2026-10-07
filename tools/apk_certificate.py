#!/usr/bin/env python3
"""Read the first signer certificate fingerprint from APK v2/v3 signing block.

This extracts metadata; it does not verify the APK signature or grant attestation.
"""
import argparse
import hashlib
from pathlib import Path
import struct


def first_field(data, offset=0):
    if offset + 4 > len(data):
        raise ValueError("Truncated length field")
    size = struct.unpack_from("<I", data, offset)[0]
    end = offset + 4 + size
    if end > len(data):
        raise ValueError("Truncated field")
    return data[offset + 4:end], end


def certificate_sha1(path):
    data = Path(path).read_bytes()
    eocd = data.rfind(b"PK\x05\x06", max(0, len(data) - 65557))
    if eocd < 0 or eocd + 22 > len(data):
        raise ValueError("Missing ZIP footer")
    offset = struct.unpack_from("<I", data, eocd + 16)[0]
    if offset < 24 or data[offset-16:offset] != b"APK Sig Block 42":
        raise ValueError("Missing APK signing block")
    size = struct.unpack_from("<Q", data, offset-24)[0]
    start = offset-size-8
    if start < 0 or struct.unpack_from("<Q", data, start)[0] != size:
        raise ValueError("Invalid APK signing block")
    cursor = start+8
    while cursor < offset-24:
        length = struct.unpack_from("<Q", data, cursor)[0]
        end = cursor+8+length
        if length < 4 or end > offset-24:
            raise ValueError("Invalid signing entry")
        ident = struct.unpack_from("<I", data, cursor+8)[0]
        if ident in (0x7109871a, 0xf05368c0):
            signers, _ = first_field(data[cursor+12:end])
            signer, _ = first_field(signers)
            signed_data, _ = first_field(signer)
            _, pos = first_field(signed_data)  # Digests
            certificates, _ = first_field(signed_data, pos)
            certificate, _ = first_field(certificates)
            return hashlib.sha1(certificate).hexdigest().upper()
        cursor = end
    raise ValueError("No v2/v3 signer found")


if __name__ == "__main__":
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("apk")
    args = parser.parse_args()
    print(certificate_sha1(args.apk))

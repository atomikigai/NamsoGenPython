package d4;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements u3.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f2880a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f2881b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int e(k kVar, x3.f fVar) {
        try {
            int iD = kVar.d();
            if ((iD & 65496) == 65496 || iD == 19789 || iD == 18761) {
                int iG = g(kVar);
                if (iG != -1) {
                    byte[] bArr = (byte[]) fVar.c(iG, byte[].class);
                    try {
                        return h(kVar, bArr, iG);
                    } finally {
                        fVar.g(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iD);
                return -1;
            }
        } catch (j unused) {
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType f(k kVar) {
        try {
            int iD = kVar.d();
            if (iD == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iG = (iD << 8) | kVar.g();
            if (iG == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iG2 = (iG << 8) | kVar.g();
            if (iG2 == -1991225785) {
                kVar.skip(21L);
                try {
                    return kVar.g() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (j unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iG2 == 1380533830) {
                kVar.skip(4L);
                if (((kVar.d() << 16) | kVar.d()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iD2 = (kVar.d() << 16) | kVar.d();
                if ((iD2 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = iD2 & 255;
                if (i != 88) {
                    if (i != 76) {
                        return ImageHeaderParser$ImageType.WEBP;
                    }
                    kVar.skip(4L);
                    return (kVar.g() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                kVar.skip(4L);
                short sG = kVar.g();
                if ((sG & 2) != 0) {
                    return ImageHeaderParser$ImageType.ANIMATED_WEBP;
                }
                return (sG & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((kVar.d() << 16) | kVar.d()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iD3 = (kVar.d() << 16) | kVar.d();
            if (iD3 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i10 = 0;
            boolean z4 = iD3 == 1635150182;
            kVar.skip(4L);
            int i11 = iG2 - 16;
            if (i11 % 4 == 0) {
                while (i10 < 5 && i11 > 0) {
                    int iD4 = (kVar.d() << 16) | kVar.d();
                    if (iD4 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (iD4 == 1635150182) {
                        z4 = true;
                    }
                    i10++;
                    i11 -= 4;
                }
            }
            return z4 ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (j unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static int g(k kVar) {
        short sG;
        int iD;
        long j4;
        long jSkip;
        do {
            short sG2 = kVar.g();
            if (sG2 == 255) {
                sG = kVar.g();
                if (sG != 218) {
                    if (sG != 217) {
                        iD = kVar.d() - 2;
                        if (sG == 225) {
                            return iD;
                        }
                        j4 = iD;
                        jSkip = kVar.skip(j4);
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                        return -1;
                    }
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sG2));
                return -1;
            }
            return -1;
        } while (jSkip == j4);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder sbD = u3.b.d(sG, iD, "Unable to skip enough data, type: ", ", wanted to skip: ", ", but actually skipped: ");
            sbD.append(jSkip);
            Log.d("DfltImageHeaderParser", sbD.toString());
        }
        return -1;
    }

    public static int h(k kVar, byte[] bArr, int i) {
        ByteOrder byteOrder;
        int iJ = kVar.j(i, bArr);
        short s10 = -1;
        if (iJ == i) {
            int i10 = 0;
            byte[] bArr2 = f2880a;
            boolean z4 = bArr != null && i > bArr2.length;
            if (z4) {
                for (int i11 = 0; i11 < bArr2.length; i11++) {
                    if (bArr[i11] != bArr2[i11]) {
                        z4 = false;
                        break;
                    }
                }
            }
            if (!z4) {
                if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                }
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
                return -1;
            }
            ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
            short s11 = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
            if (s11 != 18761) {
                if (s11 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) s11));
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            byteBuffer.order(byteOrder);
            int i12 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
            int i13 = i12 + 6;
            short s12 = byteBuffer.remaining() - i13 >= 2 ? byteBuffer.getShort(i13) : (short) -1;
            while (i10 < s12) {
                int i14 = (i10 * 12) + i12 + 8;
                short s13 = byteBuffer.remaining() - i14 >= 2 ? byteBuffer.getShort(i14) : s10;
                if (s13 != 274) {
                    s10 = s10;
                } else {
                    int i15 = i14 + 2;
                    short s14 = byteBuffer.remaining() - i15 >= 2 ? byteBuffer.getShort(i15) : s10;
                    if (s14 < 1 || s14 > 12) {
                        s10 = s10;
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) s14));
                        }
                    } else {
                        int i16 = i14 + 4;
                        int i17 = byteBuffer.remaining() - i16 >= 4 ? byteBuffer.getInt(i16) : s10;
                        if (i17 < 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Negative tiff component count");
                            }
                            s10 = s10;
                        } else {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder sbD = u3.b.d(i10, s13, "Got tagIndex=", " tagType=", " formatCode=");
                                sbD.append((int) s14);
                                sbD.append(" componentCount=");
                                sbD.append(i17);
                                Log.d("DfltImageHeaderParser", sbD.toString());
                            }
                            int i18 = i17 + f2881b[s14];
                            if (i18 <= 4) {
                                int i19 = i14 + 8;
                                if (i19 >= 0 && i19 <= byteBuffer.remaining()) {
                                    if (i18 >= 0 && i18 + i19 <= byteBuffer.remaining()) {
                                        return byteBuffer.remaining() - i19 >= 2 ? byteBuffer.getShort(i19) : s10;
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) s13));
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i19 + " tagType=" + ((int) s13));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) s14));
                            }
                        }
                    }
                }
                i10++;
                s10 = s10;
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + iJ);
            return -1;
        }
        return s10;
    }

    @Override // u3.e
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        p4.f.c(byteBuffer, "Argument must not be null");
        return f(new e7.i(byteBuffer));
    }

    @Override // u3.e
    public final int b(ByteBuffer byteBuffer, x3.f fVar) {
        e7.i iVar = new e7.i(byteBuffer);
        p4.f.c(fVar, "Argument must not be null");
        return e(iVar, fVar);
    }

    @Override // u3.e
    public final int c(InputStream inputStream, x3.f fVar) {
        ib.c cVar = new ib.c(inputStream, 11);
        p4.f.c(fVar, "Argument must not be null");
        return e(cVar, fVar);
    }

    @Override // u3.e
    public final ImageHeaderParser$ImageType d(InputStream inputStream) {
        return f(new ib.c(inputStream, 11));
    }
}

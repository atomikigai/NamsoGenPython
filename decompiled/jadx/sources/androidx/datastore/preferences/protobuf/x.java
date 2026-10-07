package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class x extends IOException {
    public static x a() {
        return new x("Protocol message had invalid UTF-8.");
    }

    public static w b() {
        return new w("Protocol message tag had invalid wire type.");
    }

    public static x c() {
        return new x("CodedInputStream encountered a malformed varint.");
    }

    public static x d() {
        return new x("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static x e() {
        return new x("Failed to parse the message.");
    }

    public static x f() {
        return new x("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}

package l5;

import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f6823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i5.c f6824c;

    public i(String str, byte[] bArr, i5.c cVar) {
        this.f6822a = str;
        this.f6823b = bArr;
        this.f6824c = cVar;
    }

    public static a2.l a() {
        a2.l lVar = new a2.l(25, false);
        lVar.f45d = i5.c.f5209a;
        return lVar;
    }

    public final i b(i5.c cVar) {
        a2.l lVarA = a();
        lVarA.K(this.f6822a);
        if (cVar == null) {
            throw new NullPointerException("Null priority");
        }
        lVarA.f45d = cVar;
        lVarA.f44c = this.f6823b;
        return lVarA.h();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f6822a.equals(iVar.f6822a) && Arrays.equals(this.f6823b, iVar.f6823b) && this.f6824c.equals(iVar.f6824c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f6822a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f6823b)) * 1000003) ^ this.f6824c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f6823b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f6822a);
        sb2.append(", ");
        sb2.append(this.f6824c);
        sb2.append(", ");
        return q1.a.m(sb2, strEncodeToString, ")");
    }
}

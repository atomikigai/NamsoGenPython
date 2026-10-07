package a7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.i0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends h7.a {
    public static final Parcelable.Creator<c> CREATOR = new n(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f212c;

    public c(byte[] bArr, String str, boolean z4) {
        if (z4) {
            i0.i(bArr);
            i0.i(str);
        }
        this.f210a = z4;
        this.f211b = bArr;
        this.f212c = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        r5 = r5.f212c;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof a7.c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            a7.c r5 = (a7.c) r5
            boolean r1 = r4.f210a
            boolean r3 = r5.f210a
            if (r1 != r3) goto L2b
            byte[] r1 = r4.f211b
            byte[] r3 = r5.f211b
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L2b
            java.lang.String r5 = r5.f212c
            java.lang.String r1 = r4.f212c
            if (r1 == r5) goto L2a
            if (r1 == 0) goto L2b
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L2b
        L2a:
            return r0
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f211b) + (Arrays.hashCode(new Object[]{Boolean.valueOf(this.f210a), this.f212c}) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f210a ? 1 : 0);
        com.bumptech.glide.d.D(parcel, 2, this.f211b, false);
        com.bumptech.glide.d.K(parcel, 3, this.f212c, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}

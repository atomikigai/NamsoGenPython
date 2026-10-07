package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcj implements Comparable {
    private final byte[] zza;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzcj zzcjVar = (zzcj) obj;
        int length = this.zza.length;
        int length2 = zzcjVar.zza.length;
        if (length != length2) {
            return length - length2;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.zza;
            if (i >= bArr.length) {
                return 0;
            }
            byte b10 = bArr[i];
            byte b11 = zzcjVar.zza[i];
            if (b10 != b11) {
                return b10 - b11;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzcj) {
            return Arrays.equals(this.zza, ((zzcj) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return zzze.zza(this.zza);
    }
}

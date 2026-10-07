package kc;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends d implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6209d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6210f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6211r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6212s;

    @Override // kc.d
    public final int a(int i) {
        return ((-i) >> 31) & (b() >>> (32 - i));
    }

    @Override // kc.d
    public final int b() {
        int i = this.f6208c;
        int i10 = i ^ (i >>> 2);
        this.f6208c = this.f6209d;
        this.f6209d = this.e;
        this.e = this.f6210f;
        int i11 = this.f6211r;
        this.f6210f = i11;
        int i12 = ((i10 ^ (i10 << 1)) ^ i11) ^ (i11 << 4);
        this.f6211r = i12;
        int i13 = this.f6212s + 362437;
        this.f6212s = i13;
        return i12 + i13;
    }
}

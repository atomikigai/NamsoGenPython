package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import d4.w;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f1898c = new h(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1900b;

    public i() {
        this.f1899a = 0;
        this.f1900b = new HashMap();
    }

    @Override // com.bumptech.glide.load.data.g
    public void c() {
        switch (this.f1899a) {
            case 1:
            case 2:
                break;
            default:
                ((w) this.f1900b).d();
                break;
        }
    }

    public ParcelFileDescriptor d() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f1900b).rewind();
    }

    @Override // com.bumptech.glide.load.data.g
    public Object f() {
        switch (this.f1899a) {
            case 1:
                return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f1900b).rewind();
            case 2:
                return this.f1900b;
            default:
                w wVar = (w) this.f1900b;
                wVar.reset();
                return wVar;
        }
    }

    public i(InputStream inputStream, x3.f fVar) {
        this.f1899a = 3;
        w wVar = new w(inputStream, fVar);
        this.f1900b = wVar;
        wVar.mark(5242880);
    }

    public i(ParcelFileDescriptor parcelFileDescriptor) {
        this.f1899a = 1;
        this.f1900b = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public i(Object obj) {
        this.f1899a = 2;
        this.f1900b = obj;
    }

    private final void a() {
    }

    private final void b() {
    }
}

package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Comparable f1891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1892d;

    public /* synthetic */ b(int i, Comparable comparable, Object obj) {
        this.f1889a = i;
        this.f1892d = obj;
        this.f1891c = comparable;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c() {
        switch (this.f1889a) {
            case 0:
                Object obj = this.f1890b;
                if (obj != null) {
                    try {
                        g(obj);
                    } catch (IOException unused) {
                        return;
                    }
                    break;
                }
                break;
            default:
                Object obj2 = this.f1890b;
                if (obj2 != null) {
                    try {
                        g(obj2);
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        int i = this.f1889a;
    }

    @Override // com.bumptech.glide.load.data.e
    public final int d() {
        switch (this.f1889a) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.f fVar, d dVar) {
        switch (this.f1889a) {
            case 0:
                try {
                    Object objH = h((AssetManager) this.f1892d, (String) this.f1891c);
                    this.f1890b = objH;
                    dVar.f(objH);
                } catch (IOException e) {
                    if (Log.isLoggable("AssetPathFetcher", 3)) {
                        Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
                    }
                    dVar.b(e);
                    return;
                }
                break;
            default:
                try {
                    Object objI = i((Uri) this.f1891c, (ContentResolver) this.f1892d);
                    this.f1890b = objI;
                    dVar.f(objI);
                } catch (FileNotFoundException e4) {
                    if (Log.isLoggable("LocalUriFetcher", 3)) {
                        Log.d("LocalUriFetcher", "Failed to open Uri", e4);
                    }
                    dVar.b(e4);
                }
                break;
        }
    }

    public abstract void g(Object obj);

    public abstract Object h(AssetManager assetManager, String str);

    public abstract Object i(Uri uri, ContentResolver contentResolver);

    private final void b() {
    }

    private final void f() {
    }
}

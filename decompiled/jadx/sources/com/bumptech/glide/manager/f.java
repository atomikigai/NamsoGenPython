package com.bumptech.glide.manager;

import android.view.View;
import androidx.fragment.app.w;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f1918a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f1919b;

    @Override // com.bumptech.glide.manager.g
    public final void b(w wVar) {
        if (!this.f1919b && this.f1918a.add(wVar)) {
            View decorView = wVar.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new e(this, decorView));
        }
    }
}

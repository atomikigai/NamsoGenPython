package d0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends Activity implements androidx.lifecycle.r, q0.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.t f2760a;

    @Override // q0.m
    public final boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !com.bumptech.glide.d.i(decorView, keyEvent)) {
            return com.bumptech.glide.d.j(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !com.bumptech.glide.d.i(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    public void e() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = androidx.lifecycle.g0.f1047b;
        androidx.lifecycle.e0.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.t tVar = this.f2760a;
        tVar.getClass();
        tVar.c("markState");
        tVar.g();
        super.onSaveInstanceState(bundle);
    }

    public Context zza() {
        return getApplicationContext();
    }
}

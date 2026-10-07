package h3;

import android.util.Log;
import app.namso_gen.spacehowen.MainActivity;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 extends w5.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4849a;

    public t1(MainActivity mainActivity) {
        this.f4849a = mainActivity;
    }

    @Override // w5.k
    public final void a() {
        MainActivity mainActivity = this.f4849a;
        Log.d(mainActivity.W, "INTERSTITIAL cerrado");
        mainActivity.w();
        mainActivity.S = null;
    }

    @Override // w5.k
    public final void b(w5.a aVar) {
        MainActivity mainActivity = this.f4849a;
        Log.e(mainActivity.W, "INTERSTITIAL fallo al mostrar: " + aVar.f9633b);
        mainActivity.w();
        mainActivity.S = null;
    }

    @Override // w5.k
    public final void c() {
        MainActivity mainActivity = this.f4849a;
        Log.d(mainActivity.W, "INTERSTITIAL mostrado");
        mainActivity.w();
    }
}

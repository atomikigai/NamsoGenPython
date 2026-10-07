package h3;

import android.util.Log;
import app.namso_gen.spacehowen.MainActivity;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 extends w5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4837a;

    public s1(MainActivity mainActivity) {
        this.f4837a = mainActivity;
    }

    @Override // w5.c
    public final void onAdClosed() {
        Log.d(this.f4837a.W, "BANNER cerrado");
    }

    @Override // w5.c
    public final void onAdFailedToLoad(w5.l lVar) {
        Log.e(this.f4837a.W, "BANNER fallo: code=" + lVar.f9632a + " msg=" + lVar.f9633b + " response=" + lVar.e);
    }

    @Override // w5.c
    public final void onAdLoaded() {
        MainActivity mainActivity = this.f4837a;
        Log.d(mainActivity.W, "BANNER cargado OK, visibility=" + mainActivity.u().getVisibility());
    }

    @Override // w5.c
    public final void onAdOpened() {
        Log.d(this.f4837a.W, "BANNER abierto");
    }
}

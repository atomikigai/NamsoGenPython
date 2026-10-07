package h3;

import android.util.Log;
import app.namso_gen.spacehowen.MainActivity;
import com.google.android.gms.internal.ads.zzbml;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 extends j6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4856a;

    public u1(MainActivity mainActivity) {
        this.f4856a = mainActivity;
    }

    @Override // w5.d
    public final void onAdFailedToLoad(w5.l lVar) {
        MainActivity mainActivity = this.f4856a;
        Log.e(mainActivity.W, "INTERSTITIAL fallo: code=" + lVar.f9632a + " msg=" + lVar.f9633b);
        mainActivity.S = null;
    }

    @Override // w5.d
    public final void onAdLoaded(Object obj) {
        j6.a aVar = (j6.a) obj;
        jc.i.e(aVar, "interstitialAd");
        MainActivity mainActivity = this.f4856a;
        Log.d(mainActivity.W, "INTERSTITIAL cargado OK");
        aVar.setFullScreenContentCallback(new t1(mainActivity));
        mainActivity.S = (zzbml) aVar;
    }
}

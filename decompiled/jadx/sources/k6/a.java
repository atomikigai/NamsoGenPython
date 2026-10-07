package k6;

import android.content.Context;
import android.os.RemoteException;
import java.util.List;
import w5.u;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public abstract u getSDKVersionInfo();

    public abstract u getVersionInfo();

    public abstract void initialize(Context context, b bVar, List<b9.e> list);

    public void loadAppOpenAd(g gVar, c cVar) {
        cVar.onFailure(new w5.a(7, getClass().getSimpleName().concat(" does not support app open ads."), "com.google.android.gms.ads", null));
    }

    public void loadBannerAd(h hVar, c cVar) {
        cVar.onFailure(new w5.a(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads", null));
    }

    public void loadInterscrollerAd(h hVar, c cVar) {
        cVar.onFailure(new w5.a(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", null));
    }

    public void loadInterstitialAd(l lVar, c cVar) {
        cVar.onFailure(new w5.a(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads", null));
    }

    @Deprecated
    public void loadNativeAd(n nVar, c cVar) {
        cVar.onFailure(new w5.a(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads", null));
    }

    public void loadNativeAdMapper(n nVar, c cVar) throws RemoteException {
        throw new RemoteException("Method is not found");
    }

    public void loadRewardedAd(q qVar, c cVar) {
        cVar.onFailure(new w5.a(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads", null));
    }

    public void loadRewardedInterstitialAd(q qVar, c cVar) {
        cVar.onFailure(new w5.a(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads", null));
    }
}

package h3;

import android.util.Log;
import app.namso_gen.spacehowen.MainActivity;
import com.google.android.gms.internal.consent_sdk.zzj;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p1 implements l9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4801a;

    public /* synthetic */ p1(MainActivity mainActivity) {
        this.f4801a = mainActivity;
    }

    public final void a(l9.h hVar) {
        MainActivity mainActivity = this.f4801a;
        if (hVar != null) {
            Log.e(mainActivity.W, "Error al mostrar formulario de consentimiento: " + hVar.f6879a);
        }
        String str = mainActivity.W;
        StringBuilder sb2 = new StringBuilder("Consent form completado, canRequestAds=");
        zzj zzjVar = mainActivity.f1292i0;
        if (zzjVar == null) {
            jc.i.i("consentInformation");
            throw null;
        }
        sb2.append(zzjVar.canRequestAds());
        Log.d(str, sb2.toString());
        zzj zzjVar2 = mainActivity.f1292i0;
        if (zzjVar2 == null) {
            jc.i.i("consentInformation");
            throw null;
        }
        if (zzjVar2.canRequestAds()) {
            Log.d(str, "Consentido: se pueden mostrar anuncios");
        } else {
            Log.w(str, "NO consentido: los anuncios NO se pueden mostrar");
        }
    }
}

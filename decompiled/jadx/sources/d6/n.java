package d6;

import android.net.Uri;
import android.os.AsyncTask;
import android.webkit.WebView;
import bd.v;
import com.google.android.gms.internal.ads.zzavc;
import com.google.android.gms.internal.ads.zzavd;
import com.google.android.gms.internal.ads.zzbdz;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f2968a;

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        o oVar = this.f2968a;
        try {
            oVar.f2975s = (zzavc) oVar.f2971c.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            i6.h.h("", e);
        } catch (ExecutionException e4) {
            e = e4;
            i6.h.h("", e);
        } catch (TimeoutException e10) {
            i6.h.h("", e10);
        }
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) zzbdz.zzd.zze());
        v vVar = oVar.e;
        builder.appendQueryParameter("query", (String) vVar.e);
        builder.appendQueryParameter("pubId", (String) vVar.f1681b);
        builder.appendQueryParameter("mappver", (String) vVar.f1685g);
        TreeMap treeMap = (TreeMap) vVar.f1683d;
        for (String str : treeMap.keySet()) {
            builder.appendQueryParameter(str, (String) treeMap.get(str));
        }
        Uri uriBuild = builder.build();
        zzavc zzavcVar = oVar.f2975s;
        if (zzavcVar != null) {
            try {
                uriBuild = zzavcVar.zzb(uriBuild, oVar.f2972d);
            } catch (zzavd e11) {
                i6.h.h("Unable to process ad data", e11);
            }
        }
        return da.v.u(oVar.zzq(), "#", uriBuild.getEncodedQuery());
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        WebView webView = this.f2968a.f2973f;
        if (webView == null || str == null) {
            return;
        }
        webView.loadUrl(str);
    }
}

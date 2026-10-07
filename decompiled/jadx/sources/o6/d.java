package o6;

import android.net.Uri;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.zzbvx;
import com.google.android.gms.internal.ads.zzdyx;
import com.google.android.gms.internal.ads.zzfwh;
import com.google.android.gms.internal.ads.zzgdp;
import com.google.android.gms.internal.ads.zzgei;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements zzgdp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7608b;

    public /* synthetic */ d(Object obj, int i) {
        this.f7607a = i;
        this.f7608b = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgdp
    public final m9.a zza(Object obj) {
        switch (this.f7607a) {
            case 0:
                i iVar = (i) this.f7608b;
                final Uri uri = (Uri) obj;
                return zzgei.zzm(iVar.I("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzfwh() { // from class: o6.e
                    @Override // com.google.android.gms.internal.ads.zzfwh
                    public final Object apply(Object obj2) {
                        String str = (String) obj2;
                        boolean zIsEmpty = TextUtils.isEmpty(str);
                        Uri uri2 = uri;
                        return !zIsEmpty ? i.O(uri2, "nas", str) : uri2;
                    }
                }, iVar.f7626f);
            case 1:
                final i iVar2 = (i) this.f7608b;
                final ArrayList arrayList = (ArrayList) obj;
                return zzgei.zzm(iVar2.I("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzfwh() { // from class: o6.i0
                    @Override // com.google.android.gms.internal.ads.zzfwh
                    public final Object apply(Object obj2) {
                        String str = (String) obj2;
                        ArrayList arrayList2 = new ArrayList();
                        for (Uri uri2 : arrayList) {
                            i iVar3 = iVar2;
                            if (!i.N(uri2, iVar3.J, iVar3.K) || TextUtils.isEmpty(str)) {
                                arrayList2.add(uri2);
                            } else {
                                arrayList2.add(i.O(uri2, "nas", str));
                            }
                        }
                        return arrayList2;
                    }
                }, iVar2.f7626f);
            default:
                zzdyx zzdyxVar = (zzdyx) obj;
                r rVar = new r(new JsonReader(new InputStreamReader(zzdyxVar.zzb())), zzdyxVar.zza());
                try {
                    rVar.f7663b = e6.s.f3427f.f3428a.h(((zzbvx) this.f7608b).zza).toString();
                    break;
                } catch (JSONException unused) {
                    rVar.f7663b = "{}";
                }
                return zzgei.zzh(rVar);
        }
    }
}

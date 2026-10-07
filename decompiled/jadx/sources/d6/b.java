package d6;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbux;
import com.google.android.gms.internal.ads.zzbyh;
import h6.r0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzbyh f2928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzbux f2929d = new zzbux(false, Collections.EMPTY_LIST);

    public b(Context context, zzbyh zzbyhVar) {
        this.f2926a = context;
        this.f2928c = zzbyhVar;
    }

    public final void a(String str) {
        List<String> list;
        zzbux zzbuxVar = this.f2929d;
        zzbyh zzbyhVar = this.f2928c;
        if ((zzbyhVar == null || !zzbyhVar.zza().zzf) && !zzbuxVar.zza) {
            return;
        }
        if (str == null) {
            str = "";
        }
        if (zzbyhVar != null) {
            zzbyhVar.zzd(str, null, 3);
            return;
        }
        if (!zzbuxVar.zza || (list = zzbuxVar.zzb) == null) {
            return;
        }
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                r0 r0Var = p.C.f2979c;
                r0.j(this.f2926a, "", strReplace);
            }
        }
    }

    public final boolean b() {
        zzbyh zzbyhVar = this.f2928c;
        return ((zzbyhVar == null || !zzbyhVar.zza().zzf) && !this.f2929d.zza) || this.f2927b;
    }
}

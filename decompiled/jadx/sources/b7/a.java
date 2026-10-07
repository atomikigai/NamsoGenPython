package b7;

import a8.b;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends l {
    private static final h zza;
    private static final com.google.android.gms.common.api.a zzb;
    private static final i zzc;

    static {
        h hVar = new h();
        zza = hVar;
        b bVar = new b(2);
        zzb = bVar;
        zzc = new i("SmsRetriever.API", bVar, hVar);
    }

    public a(Activity activity) {
        super(activity, activity, zzc, e.f2049j, k.f2167c);
    }

    public a(Context context) {
        super(context, null, zzc, e.f2049j, k.f2167c);
    }
}

package h6;

import android.content.Context;
import com.google.android.gms.internal.ads.zzapl;
import com.google.android.gms.internal.ads.zzapp;
import com.google.android.gms.internal.ads.zzaps;
import com.google.android.gms.internal.ads.zzapy;
import com.google.android.gms.internal.ads.zzaqe;
import com.google.android.gms.internal.ads.zzaql;
import com.google.android.gms.internal.ads.zzaqq;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzblo;
import com.google.android.gms.internal.ads.zzfsb;
import com.google.android.gms.internal.ads.zzfsc;
import java.io.File;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends zzaqe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5035a;

    public n(Context context, zzaqq zzaqqVar) {
        super(zzaqqVar);
        this.f5035a = context;
    }

    public static zzaps a(Context context) {
        zzaps zzapsVar = new zzaps(new zzaql(new File(zzfsc.zza(zzfsb.zza(), context.getCacheDir(), "admob_volley")), 20971520), new n(context, new zzaqq(null, null)), 4);
        zzapsVar.zzd();
        return zzapsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqe, com.google.android.gms.internal.ads.zzapi
    public final zzapl zza(zzapp zzappVar) throws zzapy {
        if (zzappVar.zza() == 0) {
            if (Pattern.matches((String) e6.t.f3437d.f3440c.zza(zzbcn.zzew), zzappVar.zzk())) {
                i6.d dVar = e6.s.f3427f.f3428a;
                g7.f fVar = g7.f.f4241b;
                Context context = this.f5035a;
                if (fVar.d(context, 13400000) == 0) {
                    zzapl zzaplVarZza = new zzblo(context).zza(zzappVar);
                    if (zzaplVarZza != null) {
                        k0.k("Got gmscore asset response: ".concat(String.valueOf(zzappVar.zzk())));
                        return zzaplVarZza;
                    }
                    k0.k("Failed to get gmscore asset response: ".concat(String.valueOf(zzappVar.zzk())));
                }
            }
        }
        return super.zza(zzappVar);
    }
}

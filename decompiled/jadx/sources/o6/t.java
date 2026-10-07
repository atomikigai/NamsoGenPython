package o6;

import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbdx;
import com.google.android.gms.internal.ads.zzbes;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends q6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f7671b;

    public t(a aVar, String str) {
        this.f7670a = str;
        this.f7671b = aVar;
    }

    @Override // q6.b
    public final void onFailure(String str) {
        long jLongValue;
        i6.h.g("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        boolean zBooleanValue = ((Boolean) zzbes.zza.zze()).booleanValue();
        a aVar = this.f7671b;
        String strConcat = zBooleanValue ? ",\"appLevelSignals\":".concat(aVar.f7587k.a().toString()) : "";
        Locale locale = Locale.getDefault();
        zzbdx zzbdxVar = zzbes.zzb;
        if (((Boolean) zzbdxVar.zze()).booleanValue()) {
            jLongValue = ((Long) e6.t.f3437d.f3440c.zza(zzbcn.zzjz)).longValue();
        } else {
            jLongValue = 0;
        }
        String str2 = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", this.f7670a, str, Long.valueOf(jLongValue), strConcat);
        if (((Boolean) zzbdxVar.zze()).booleanValue()) {
            try {
                aVar.h.execute(new s(this, str2, 0));
            } catch (RuntimeException e) {
                d6.p.C.f2982g.zzv(e, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
            }
        } else {
            aVar.f7581b.evaluateJavascript(str2, null);
        }
        if (((Boolean) zzbes.zza.zze()).booleanValue()) {
            v vVar = aVar.f7588l;
            vVar.getClass();
            vVar.f7676c.execute(new u(vVar, 0));
        }
    }

    @Override // q6.b
    public final void onSuccess(q6.a aVar) {
        String str;
        long jLongValue;
        String str2 = this.f7670a;
        a aVar2 = this.f7671b;
        b bVar = aVar2.f7587k;
        String str3 = aVar.f8042a.f3089a;
        long jLongValue2 = 0;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", str2);
            jSONObject.put("signal", str3);
            if (((Boolean) zzbes.zzb.zze()).booleanValue()) {
                jLongValue = ((Long) e6.t.f3437d.f3440c.zza(zzbcn.zzjz)).longValue();
            } else {
                jLongValue = 0;
            }
            jSONObject.put("sdk_ttl_ms", jLongValue);
            if (((Boolean) zzbes.zza.zze()).booleanValue()) {
                jSONObject.put("appLevelSignals", bVar.a());
            }
            str = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            String strConcat = ((Boolean) zzbes.zza.zze()).booleanValue() ? ",\"appLevelSignals\":".concat(bVar.a().toString()) : "";
            Locale locale = Locale.getDefault();
            String str4 = aVar.f8042a.f3089a;
            if (((Boolean) zzbes.zzb.zze()).booleanValue()) {
                jLongValue2 = ((Long) e6.t.f3437d.f3440c.zza(zzbcn.zzjz)).longValue();
            }
            str = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, str4, Long.valueOf(jLongValue2), strConcat);
        }
        if (((Boolean) zzbes.zzb.zze()).booleanValue()) {
            try {
                aVar2.h.execute(new s(this, str, 1));
            } catch (RuntimeException e) {
                d6.p.C.f2982g.zzv(e, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
            }
        } else {
            aVar2.f7581b.evaluateJavascript(str, null);
        }
        if (((Boolean) zzbes.zza.zze()).booleanValue()) {
            v vVar = aVar2.f7588l;
            vVar.getClass();
            vVar.f7676c.execute(new u(vVar, 0));
        }
    }
}

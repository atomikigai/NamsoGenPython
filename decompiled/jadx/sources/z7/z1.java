package z7;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11503a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11506d;
    public final /* synthetic */ Cloneable e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ z1(b3.b bVar, int i, Exception exc, byte[] bArr, Map map) {
        this.f11505c = bVar;
        this.f11504b = i;
        this.f11506d = exc;
        this.e = bArr;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006a  */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11503a) {
            case 0:
                b3.b bVar = (b3.b) this.f11505c;
                Exception exc = (Exception) this.f11506d;
                byte[] bArr = (byte[]) this.e;
                a1 a1Var = (a1) ((ta.c) bVar.f1368d).f8662a;
                d3 d3Var = a1Var.f11010w;
                i0 i0Var = a1Var.f11007t;
                int i = this.f11504b;
                if (i == 200 || i == 204) {
                    if (exc == null) {
                        q0 q0Var = a1Var.f11006s;
                        a1.d(q0Var);
                        q0Var.C.a(true);
                        if (bArr != null || bArr.length == 0) {
                            a1.f(i0Var);
                            i0Var.f11197x.b("Deferred Deep Link response empty.");
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(new String(bArr));
                                String strOptString = jSONObject.optString("deeplink", "");
                                String strOptString2 = jSONObject.optString("gclid", "");
                                double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                                if (TextUtils.isEmpty(strOptString)) {
                                    a1.f(i0Var);
                                    i0Var.f11197x.b("Deferred Deep Link is empty.");
                                } else {
                                    a1.d(d3Var);
                                    a1 a1Var2 = (a1) d3Var.f159a;
                                    if (!TextUtils.isEmpty(strOptString)) {
                                        Context context = a1Var2.f11000a;
                                        Context context2 = a1Var2.f11000a;
                                        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                                        if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                                            Bundle bundle = new Bundle();
                                            bundle.putString("gclid", strOptString2);
                                            bundle.putString("_cis", "ddp");
                                            a1Var.A.k("auto", "_cmp", bundle);
                                            if (!TextUtils.isEmpty(strOptString)) {
                                                try {
                                                    SharedPreferences.Editor editorEdit = context2.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                                    editorEdit.putString("deeplink", strOptString);
                                                    editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                                                    if (editorEdit.commit()) {
                                                        context2.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                                    }
                                                } catch (RuntimeException e) {
                                                    i0 i0Var2 = ((a1) d3Var.f159a).f11007t;
                                                    a1.f(i0Var2);
                                                    i0Var2.f11190f.c(e, "Failed to persist Deferred Deep Link. exception");
                                                }
                                            }
                                        }
                                    }
                                    a1.f(i0Var);
                                    i0Var.f11193t.d(strOptString2, "Deferred Deep Link validation failed. gclid, deep link", strOptString);
                                }
                            } catch (JSONException e4) {
                                a1.f(i0Var);
                                i0Var.f11190f.c(e4, "Failed to parse the Deferred Deep Link response. exception");
                                return;
                            }
                        }
                    }
                } else if (i == 304) {
                    i = 304;
                    if (exc == null) {
                        q0 q0Var2 = a1Var.f11006s;
                        a1.d(q0Var2);
                        q0Var2.C.a(true);
                        if (bArr != null) {
                        }
                        a1.f(i0Var);
                        i0Var.f11197x.b("Deferred Deep Link response empty.");
                    }
                }
                a1.f(i0Var);
                i0Var.f11193t.d(Integer.valueOf(i), "Network Request for Deferred Deep Link failed. response, exception", exc);
                break;
            default:
                v1.d dVar = (v1.d) this.f11505c;
                i0 i0Var3 = (i0) this.f11506d;
                Intent intent = (Intent) this.e;
                o2 o2Var = (o2) ((Service) dVar.f9128a);
                int i10 = this.f11504b;
                if (o2Var.zzc(i10)) {
                    i0Var3.f11198y.c(Integer.valueOf(i10), "Local AppMeasurementService processed last upload request. StartId");
                    dVar.j().f11198y.b("Completed wakeful intent.");
                    o2Var.a(intent);
                }
                break;
        }
    }

    public /* synthetic */ z1(v1.d dVar, int i, i0 i0Var, Intent intent) {
        this.f11505c = dVar;
        this.f11504b = i;
        this.f11506d = i0Var;
        this.e = intent;
    }
}

package h3;

import android.content.Context;
import android.util.Log;
import app.namso_gen.spacehowen.MainActivity;
import app.namso_gen.spacehowen.R;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.consent_sdk.zza;
import com.google.android.gms.internal.consent_sdk.zzbk;
import com.google.android.gms.internal.consent_sdk.zzco;
import com.google.android.gms.internal.consent_sdk.zzj;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import h3.p1;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import l9.c;
import l9.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l1 implements o3.n, l9.e, l9.d, o3.m, androidx.activity.result.b, OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4762b;

    public /* synthetic */ l1(MainActivity mainActivity, int i) {
        this.f4761a = i;
        this.f4762b = mainActivity;
    }

    @Override // o3.m
    public void b(o3.e eVar, List list) {
        Object next;
        Object next2;
        int i = this.f4761a;
        yb.d dVar = null;
        MainActivity mainActivity = this.f4762b;
        int i10 = 0;
        switch (i) {
            case 3:
                String str = mainActivity.Z;
                String str2 = mainActivity.f1284a0;
                int i11 = MainActivity.f1283j0;
                jc.i.e(eVar, "billingResult");
                jc.i.e(list, "purchases");
                String str3 = mainActivity.W;
                Log.d(str3, "checkSubscriptionStatus: code=" + eVar.f7495a + ", purchases=" + Integer.valueOf(list.size()));
                if (eVar.f7495a != 0) {
                    boolean z4 = mainActivity.getSharedPreferences(str2, 0).getBoolean(str, false);
                    Log.w(str3, "checkSubscriptionStatus: FALLA billing code=" + eVar.f7495a + ", usando cache=" + z4);
                    mainActivity.Y = z4;
                    mainActivity.A();
                } else {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            Purchase purchase = (Purchase) next;
                            if (purchase.b() != 1 || !purchase.f1835c.optBoolean("acknowledged", true) || !purchase.a().contains("monthly_subscription")) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    Purchase purchase2 = (Purchase) next;
                    if (purchase2 == null) {
                        Log.d(str3, "checkSubscriptionStatus: sin sub local, cache_was=" + mainActivity.getSharedPreferences(str2, 0).getBoolean(str, false));
                        mainActivity.Y = false;
                        mainActivity.y(false);
                        mainActivity.A();
                    } else {
                        rc.b0.q(androidx.lifecycle.i0.e(mainActivity), null, new r1(purchase2, mainActivity, dVar, i10), 3);
                    }
                }
                break;
            default:
                int i12 = MainActivity.f1283j0;
                jc.i.e(eVar, "billingResult");
                jc.i.e(list, "purchases");
                String str4 = mainActivity.W;
                Log.d(str4, "onResume billing: code=" + eVar.f7495a + ", purchases=" + Integer.valueOf(list.size()));
                if (eVar.f7495a != 0) {
                    boolean z10 = mainActivity.getSharedPreferences(mainActivity.f1284a0, 0).getBoolean(mainActivity.Z, false);
                    Log.d(str4, "onResume billing FALLÓ, usando cache=" + z10);
                    mainActivity.Y = z10;
                    mainActivity.runOnUiThread(new o1(mainActivity, 1));
                } else {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next2 = it2.next();
                            Purchase purchase3 = (Purchase) next2;
                            if (purchase3.b() != 1 || !purchase3.f1835c.optBoolean("acknowledged", true) || !purchase3.a().contains("monthly_subscription")) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    Purchase purchase4 = (Purchase) next2;
                    if (purchase4 == null) {
                        mainActivity.Y = false;
                        mainActivity.y(false);
                        mainActivity.runOnUiThread(new o1(mainActivity, 0));
                    } else {
                        rc.b0.q(androidx.lifecycle.i0.e(mainActivity), null, new r1(purchase4, mainActivity, dVar, 2), 3);
                    }
                }
                break;
        }
    }

    @Override // androidx.activity.result.b
    public void e(Object obj) {
        Log.d(this.f4762b.W, "Permiso de notificaciones concedido=" + ((Boolean) obj));
    }

    @Override // o3.n
    public void j(o3.e eVar, List list) {
        int i = MainActivity.f1283j0;
        jc.i.e(eVar, "billingResult");
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Purchase purchase = (Purchase) it.next();
                if (purchase.b() == 1 && !purchase.f1835c.optBoolean("acknowledged", true) && purchase.a().contains("monthly_subscription")) {
                    String strC = purchase.c();
                    if (strC == null) {
                        throw new IllegalArgumentException("Purchase token must be set");
                    }
                    h2.a aVar = new h2.a();
                    aVar.f4607a = strC;
                    MainActivity mainActivity = this.f4762b;
                    o3.b bVar = mainActivity.X;
                    if (bVar == null) {
                        jc.i.i("billingClient");
                        throw null;
                    }
                    bVar.t(aVar, new e5.c(11, mainActivity, purchase));
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        String strC;
        int i = MainActivity.f1283j0;
        jc.i.e(task, "task");
        if (task.isSuccessful()) {
            MainActivity mainActivity = this.f4762b;
            jb.b bVar = mainActivity.P;
            if (bVar == null) {
                jc.i.i("remoteConfig");
                throw null;
            }
            kb.i iVar = bVar.f5740g;
            Pattern pattern = kb.i.f6175f;
            Pattern pattern2 = kb.i.e;
            kb.c cVar = iVar.f6178c;
            String strC2 = kb.i.c(cVar, "show_alert");
            if (strC2 == null) {
                strC = kb.i.c(iVar.f6179d, "show_alert");
                if (strC != null) {
                    if (!pattern2.matcher(strC).matches()) {
                        if (pattern.matcher(strC).matches()) {
                            return;
                        }
                    }
                }
                kb.i.d("show_alert", "Boolean");
                return;
            }
            if (!pattern2.matcher(strC2).matches()) {
                if (pattern.matcher(strC2).matches()) {
                    iVar.a("show_alert", kb.i.b(cVar));
                    return;
                }
                strC = kb.i.c(iVar.f6179d, "show_alert");
                if (strC != null) {
                    if (!pattern2.matcher(strC).matches()) {
                        if (pattern.matcher(strC).matches()) {
                            return;
                        }
                    }
                }
                kb.i.d("show_alert", "Boolean");
                return;
            }
            iVar.a("show_alert", kb.i.b(cVar));
            ea.j jVar = new ea.j((Context) mainActivity, R.style.MyDialogTheme);
            String string = mainActivity.getString(R.string.warning_title);
            g.b bVar2 = (g.b) jVar.f3530b;
            bVar2.f3971d = string;
            jb.b bVar3 = mainActivity.P;
            if (bVar3 == null) {
                jc.i.i("remoteConfig");
                throw null;
            }
            bVar2.f3972f = bVar3.c("alert_message");
            jVar.k(mainActivity.getString(R.string.btn_continue), new k1(mainActivity, 2));
            bVar2.f3977m = false;
            g.f fVarA = jVar.a();
            fVarA.show();
            fVarA.b(-1).setTextColor(mainActivity.getColor(R.color.teal_700));
            fVarA.b(-2).setTextColor(mainActivity.getColor(R.color.teal_700));
        }
    }

    @Override // l9.d
    public void onConsentInfoUpdateFailure(l9.h hVar) {
        Log.e(this.f4762b.W, "Error al obtener información de consentimiento: " + hVar.f6879a);
    }

    @Override // l9.e
    public void onConsentInfoUpdateSuccess() {
        final MainActivity mainActivity = this.f4762b;
        String str = mainActivity.W;
        StringBuilder sb2 = new StringBuilder("Consent info actualizada OK, formAvailable=");
        zzj zzjVar = mainActivity.f1292i0;
        if (zzjVar == null) {
            jc.i.i("consentInformation");
            throw null;
        }
        sb2.append(zzjVar.isConsentFormAvailable());
        sb2.append(", canRequestAds=");
        zzj zzjVar2 = mainActivity.f1292i0;
        if (zzjVar2 == null) {
            jc.i.i("consentInformation");
            throw null;
        }
        sb2.append(zzjVar2.canRequestAds());
        Log.d(str, sb2.toString());
        zzj zzjVar3 = mainActivity.f1292i0;
        if (zzjVar3 == null) {
            jc.i.i("consentInformation");
            throw null;
        }
        if (zzjVar3.isConsentFormAvailable()) {
            final p1 p1Var = new p1(mainActivity);
            if (zza.zza(mainActivity).zzb().canRequestAds()) {
                p1Var.a(null);
            } else {
                zzbk zzbkVarZzc = zza.zza(mainActivity).zzc();
                zzco.zza();
                zzbkVarZzc.zzb(new l9.j() { // from class: com.google.android.gms.internal.consent_sdk.zzbi
                    @Override // l9.j
                    public final void onConsentFormLoadSuccess(c cVar) {
                        cVar.show(mainActivity, p1Var);
                    }
                }, new l9.i() { // from class: com.google.android.gms.internal.consent_sdk.zzbj
                    @Override // l9.i
                    public final void onConsentFormLoadFailure(h hVar) {
                        ((p1) p1Var).a(hVar);
                    }
                });
            }
            zzj zzjVar4 = mainActivity.f1292i0;
            if (zzjVar4 != null) {
                zzjVar4.getPrivacyOptionsRequirementStatus();
            } else {
                jc.i.i("consentInformation");
                throw null;
            }
        }
    }
}

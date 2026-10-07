package o3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.h0;
import com.google.android.gms.internal.play_billing.zzbt;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzeu;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzhz;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;
import com.google.android.gms.internal.play_billing.zziq;
import com.google.android.gms.internal.play_billing.zzis;
import com.google.android.gms.internal.play_billing.zzja;
import h6.o0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f7548c;

    public y(h0 h0Var, boolean z4) {
        this.f7548c = h0Var;
        this.f7547b = z4;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f7546a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f7547b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f7546a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter) throws Throwable {
        y yVar;
        try {
            try {
                if (this.f7546a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    yVar = this;
                    context.registerReceiver(yVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.f7547b ? 4 : 2);
                } else {
                    yVar = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                yVar.f7546a = true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void c(Context context) {
        if (!this.f7546a) {
            zzc.zzn("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f7546a = false;
        }
    }

    public final void d(Bundle bundle, e eVar, int i, zzil zzilVar, long j4, boolean z4) {
        try {
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            h0 h0Var = this.f7548c;
            if (byteArray != null) {
                ((o0) ((w) h0Var.f2117d)).v(zzhx.zzA(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), zzeu.zza()), j4, z4);
            } else {
                ((o0) ((w) h0Var.f2117d)).v(v.b(zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY, i, eVar, null, zzilVar), j4, z4);
            }
        } catch (Throwable unused) {
            zzc.zzn("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzil zzilVar;
        int i;
        e eVarZzh;
        zzis zzisVar;
        int iIntValue;
        String action = intent.getAction();
        int iHashCode = action.hashCode();
        if (iHashCode != -1484087650) {
            if (iHashCode != -337612916) {
                if (iHashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                    zzilVar = zzil.ALTERNATIVE_BILLING_ACTION;
                } else {
                    zzilVar = zzil.BROADCAST_ACTION_UNSPECIFIED;
                }
            } else if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                zzilVar = zzil.LOCAL_PURCHASES_UPDATED_ACTION;
            } else {
                zzilVar = zzil.BROADCAST_ACTION_UNSPECIFIED;
            }
        } else if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            zzilVar = zzil.PURCHASES_UPDATED_ACTION;
        } else {
            zzilVar = zzil.BROADCAST_ACTION_UNSPECIFIED;
        }
        zzil zzilVar2 = zzilVar;
        zzil zzilVar3 = zzil.LOCAL_PURCHASES_UPDATED_ACTION;
        if (zzilVar2.equals(zzilVar3) || zzilVar2.equals(zzil.ALTERNATIVE_BILLING_ACTION)) {
            i = 2;
        } else {
            i = zzilVar2.equals(zzil.PURCHASES_UPDATED_ACTION) ? 32 : 1;
        }
        Bundle extras = intent.getExtras();
        h0 h0Var = this.f7548c;
        if (extras == null) {
            zzc.zzn("BillingBroadcastManager", "Bundle is null.");
            w wVar = (w) h0Var.f2117d;
            zzie zzieVar = zzie.NULL_BUNDLE_IN_BROADCAST_RECEIVER;
            e eVar = x.h;
            ((o0) wVar).t(v.b(zzieVar, i, eVar, null, zzilVar2));
            n nVar = (n) h0Var.f2116c;
            if (nVar != null) {
                nVar.j(eVar, null);
                return;
            }
            return;
        }
        if (i == 2) {
            int i10 = zzc.zza;
            f7.l lVarA = e.a();
            lVarA.f3642a = zzc.zzb(intent.getExtras(), "BillingBroadcastManager");
            Bundle extras2 = intent.getExtras();
            if (extras2 == null) {
                zzc.zzn("BillingBroadcastManager", "Unexpected null bundle received!");
            } else {
                Object obj = extras2.get("SUB_RESPONSE_CODE");
                if (obj == null) {
                    zzc.zzm("BillingBroadcastManager", "getLaunchBillingFlowSubResponseCodeFromBundle() got null response code, assuming OK");
                } else {
                    if (obj instanceof Integer) {
                        iIntValue = ((Integer) obj).intValue();
                    } else {
                        zzc.zzn("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(obj.getClass().getName()));
                    }
                    lVarA.f3643b = iIntValue;
                    lVarA.f3644c = zzc.zzj(intent.getExtras(), "BillingBroadcastManager");
                    eVarZzh = lVarA.a();
                }
            }
            iIntValue = 0;
            lVarA.f3643b = iIntValue;
            lVarA.f3644c = zzc.zzj(intent.getExtras(), "BillingBroadcastManager");
            eVarZzh = lVarA.a();
        } else {
            eVarZzh = zzc.zzh(intent, "BillingBroadcastManager");
        }
        long j4 = extras.getLong("billingClientTransactionId", 0L);
        boolean z4 = extras.getBoolean("wasServiceAutoReconnected", false);
        if (!zzilVar2.equals(zzil.PURCHASES_UPDATED_ACTION) && !zzilVar2.equals(zzilVar3)) {
            if (zzilVar2.equals(zzil.ALTERNATIVE_BILLING_ACTION)) {
                if (eVarZzh.f7495a != 0) {
                    e eVar2 = eVarZzh;
                    d(extras, eVar2, i, zzilVar2, j4, z4);
                    ((n) h0Var.f2116c).j(eVar2, zzbt.zzk());
                    return;
                }
                h0Var.getClass();
                zzc.zzn("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                w wVar2 = (w) h0Var.f2117d;
                zzie zzieVar2 = zzie.MISSING_USER_CHOICE_BILLING_LISTENER;
                e eVar3 = x.h;
                ((o0) wVar2).v(v.b(zzieVar2, i, eVar3, null, zzilVar2), j4, z4);
                ((n) h0Var.f2116c).j(eVar3, zzbt.zzk());
                return;
            }
            return;
        }
        e eVar4 = eVarZzh;
        List listZzl = zzc.zzl(extras);
        if (eVar4.f7495a == 0) {
            w wVar3 = (w) h0Var.f2117d;
            zzib zzibVarC = v.c(i, zzilVar2);
            o0 o0Var = (o0) wVar3;
            o0Var.getClass();
            try {
                zzhz zzhzVar = (zzhz) zzibVarC.zzm();
                zzja zzjaVar = (zzja) zzibVarC.zzA().zzm();
                zzjaVar.zza(z4);
                zzhzVar.zzm(zzjaVar);
                zzib zzibVar = (zzib) zzhzVar.zze();
                if (j4 == 0) {
                    zzisVar = (zzis) o0Var.f5061b;
                } else {
                    zziq zziqVar = (zziq) ((zzis) o0Var.f5061b).zzm();
                    zziqVar.zzo(j4);
                    zzisVar = (zzis) zziqVar.zze();
                }
                o0Var.z(zzibVar, zzisVar);
            } catch (Throwable th) {
                zzc.zzo("BillingLogger", "Unable to log.", th);
            }
        } else {
            d(extras, eVar4, i, zzilVar2, j4, z4);
        }
        ((n) h0Var.f2116c).j(eVar4, listZzl);
    }
}

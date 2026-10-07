package com.android.billingclient.api;

import a5.b;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.m;
import androidx.activity.result.d;
import androidx.activity.result.h;
import androidx.fragment.app.e0;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.internal.play_billing.zzc;
import e7.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class ProxyBillingActivityV2 extends m {
    public d E;
    public d F;
    public d G;
    public ResultReceiver H;
    public ResultReceiver I;
    public ResultReceiver J;

    @Override // androidx.activity.m, d0.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = (d) o(new b(this, 23), new e0(4));
        this.F = (d) o(new a4.b(this, 25), new e0(4));
        this.G = (d) o(new i(this, 29), new e0(4));
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.H = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.I = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.J = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
                return;
            }
            return;
        }
        zzc.zzm("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.H = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            d dVar = this.E;
            jc.i.e(pendingIntent, f.KEY_PENDING_INTENT);
            IntentSender intentSender = pendingIntent.getIntentSender();
            jc.i.d(intentSender, "pendingIntent.intentSender");
            dVar.a(new h(intentSender, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.I = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            d dVar2 = this.F;
            jc.i.e(pendingIntent2, f.KEY_PENDING_INTENT);
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            jc.i.d(intentSender2, "pendingIntent.intentSender");
            dVar2.a(new h(intentSender2, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.J = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            d dVar3 = this.G;
            jc.i.e(pendingIntent3, f.KEY_PENDING_INTENT);
            IntentSender intentSender3 = pendingIntent3.getIntentSender();
            jc.i.d(intentSender3, "pendingIntent.intentSender");
            dVar3.a(new h(intentSender3, null, 0, 0));
        }
    }

    @Override // androidx.activity.m, d0.i, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.H;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.I;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.J;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
    }
}

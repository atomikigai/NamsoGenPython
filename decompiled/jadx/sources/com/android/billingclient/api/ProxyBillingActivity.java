package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;
import f7.l;
import o3.e;
import o3.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ResultReceiver f1828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1831d;
    public long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1832f;

    public final Intent a(zzie zzieVar, long j4) {
        Intent intentB = b();
        intentB.putExtra("RESPONSE_CODE", 6);
        intentB.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        l lVarA = e.a();
        lVarA.f3642a = 6;
        lVarA.f3644c = "An internal error occurred.";
        e eVarA = lVarA.a();
        int i = v.f7529a;
        intentB.putExtra("FAILURE_LOGGING_PAYLOAD", v.b(zzieVar, 2, eVarA, null, zzil.BROADCAST_ACTION_UNSPECIFIED).zzM());
        intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentB.putExtra("billingClientTransactionId", j4);
        intentB.putExtra("wasServiceAutoReconnected", this.f1832f);
        return intentB;
    }

    public final Intent b() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i10, Intent intent) {
        zzie zzieVar;
        Intent intentA;
        super.onActivityResult(i, i10, intent);
        if (i == 100 || i == 110) {
            int i11 = zzc.zzh(intent, "ProxyBillingActivity").f7495a;
            if (i10 != -1) {
                zzc.zzn("ProxyBillingActivity", "Activity finished with resultCode " + i10 + " and billing's responseCode: " + i11);
            } else if (i11 != 0) {
                i10 = -1;
                zzc.zzn("ProxyBillingActivity", "Activity finished with resultCode " + i10 + " and billing's responseCode: " + i11);
            } else {
                i10 = -1;
            }
            if (intent == null) {
                zzc.zzn("ProxyBillingActivity", "Got null data with resultCode " + i10 + "!");
                if (i10 == -1) {
                    zzieVar = zzie.NULL_DATA_WITH_OK_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
                } else if (i10 == 0) {
                    zzieVar = zzie.NULL_DATA_WITH_CANCELLED_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
                } else if (i10 == 3) {
                    zzieVar = zzie.NULL_DATA_WITH_PLAY_CANCELED_RESULT_CODE;
                } else if (i10 != 4) {
                    zzieVar = i10 != 5 ? zzie.NULL_DATA_WITH_OTHER_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT : zzie.NULL_DATA_WITH_ON_CREATE_RUNTIME_EXCEPTION_RESULT_CODE;
                } else {
                    zzieVar = zzie.NULL_DATA_WITH_PLAY_CANCELED_WITHOUT_COMPLETE_ACTION_RESULT_CODE;
                }
                intentA = a(zzieVar, this.e);
            } else if (intent.getExtras() != null) {
                String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    intentA = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                    intentA.setPackage(getApplicationContext().getPackageName());
                    intentA.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    intentA.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                } else {
                    Intent intentB = b();
                    intentB.putExtras(intent.getExtras());
                    intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    intentA = intentB;
                }
                intentA.putExtra("billingClientTransactionId", this.e);
                intentA.putExtra("wasServiceAutoReconnected", this.f1832f);
            } else {
                zzc.zzn("ProxyBillingActivity", "Got null bundle!");
                intentA = a(zzie.NULL_BUNDLE_IN_ACTIVITY_RESULT, this.e);
            }
            if (i == 110) {
                intentA.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentA);
        } else if (i == 101) {
            int iZza = zzc.zza(intent, "ProxyBillingActivity");
            ResultReceiver resultReceiver = this.f1828a;
            if (resultReceiver != null) {
                resultReceiver.send(iZza, intent == null ? null : intent.getExtras());
            }
        } else {
            zzc.zzn("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i + "; skipping...");
        }
        this.f1829b = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            zzc.zzm("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f1829b = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f1828a = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f1830c = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f1831d = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.e = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.f1832f = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        zzc.zzm("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f1831d = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f1830c = true;
                this.f1831d = 110;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f1828a = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f1831d = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.e = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.f1832f = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.f1829b = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f1831d, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e) {
            zzc.zzo("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
            ResultReceiver resultReceiver = this.f1828a;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                Intent intentA = a(zzie.INTENT_SENDER_EXCEPTION, this.e);
                if (this.f1830c) {
                    intentA.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentA);
            }
            this.f1829b = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f1829b) {
            Intent intentB = b();
            intentB.putExtra("RESPONSE_CODE", 1);
            intentB.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            if (this.f1830c) {
                intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i = this.f1831d;
            if (i == 110 || i == 100) {
                intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentB.putExtra("billingClientTransactionId", this.e);
            }
            sendBroadcast(intentB);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f1828a;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f1829b);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f1830c);
        bundle.putInt("activity_code", this.f1831d);
        bundle.putLong("billingClientTransactionId", this.e);
        bundle.putBoolean("wasServiceAutoReconnected", this.f1832f);
    }
}

package com.google.android.gms.common.api.internal;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.internal.base.zao;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2061c;

    public /* synthetic */ a1(int i, Object obj, Object obj2) {
        this.f2059a = i;
        this.f2061c = obj;
        this.f2060b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.internal.n nVar;
        com.google.android.gms.common.internal.n v0Var = null;
        switch (this.f2059a) {
            case 0:
                if (((b1) this.f2061c).f2063a) {
                    g7.b bVar = ((z0) this.f2060b).f2166b;
                    if (bVar.f4229b != 0 && bVar.f4230c != null) {
                        b1 b1Var = (b1) this.f2061c;
                        l lVar = b1Var.mLifecycleFragment;
                        Activity activity = b1Var.getActivity();
                        PendingIntent pendingIntent = bVar.f4230c;
                        com.google.android.gms.common.internal.i0.i(pendingIntent);
                        int i = ((z0) this.f2060b).f2165a;
                        int i10 = GoogleApiActivity.f2037b;
                        Intent intent = new Intent(activity, (Class<?>) GoogleApiActivity.class);
                        intent.putExtra("pending_intent", pendingIntent);
                        intent.putExtra("failing_client_id", i);
                        intent.putExtra("notify_manager", false);
                        lVar.startActivityForResult(intent, 1);
                        return;
                    }
                    b1 b1Var2 = (b1) this.f2061c;
                    if (b1Var2.f2066d.b(b1Var2.getActivity(), null, bVar.f4229b) != null) {
                        b1 b1Var3 = (b1) this.f2061c;
                        b1Var3.f2066d.j(b1Var3.getActivity(), b1Var3.mLifecycleFragment, bVar.f4229b, (b1) this.f2061c);
                        return;
                    }
                    if (bVar.f4229b != 18) {
                        b1 b1Var4 = (b1) this.f2061c;
                        int i11 = ((z0) this.f2060b).f2165a;
                        b1Var4.f2064b.set(null);
                        b1Var4.a(bVar, i11);
                        return;
                    }
                    b1 b1Var5 = (b1) this.f2061c;
                    g7.e eVar = b1Var5.f2066d;
                    Activity activity2 = b1Var5.getActivity();
                    eVar.getClass();
                    ProgressBar progressBar = new ProgressBar(activity2, null, R.attr.progressBarStyleLarge);
                    progressBar.setIndeterminate(true);
                    progressBar.setVisibility(0);
                    AlertDialog.Builder builder = new AlertDialog.Builder(activity2);
                    builder.setView(progressBar);
                    builder.setMessage(com.google.android.gms.common.internal.x.b(activity2, 18));
                    builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                    AlertDialog alertDialogCreate = builder.create();
                    g7.e.h(activity2, alertDialogCreate, "GooglePlayServicesUpdatingDialog", b1Var5);
                    b1 b1Var6 = (b1) this.f2061c;
                    Context applicationContext = b1Var6.getActivity().getApplicationContext();
                    a0 a0Var = new a0(this, alertDialogCreate);
                    b1Var6.f2066d.getClass();
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addDataScheme("package");
                    j0 j0Var = new j0(a0Var);
                    zao.zaa(applicationContext, j0Var, intentFilter);
                    j0Var.f2121b = applicationContext;
                    if (g7.h.b(applicationContext)) {
                        return;
                    }
                    b1 b1Var7 = (b1) this.f2061c;
                    b1Var7.f2064b.set(null);
                    b1Var7.b();
                    if (alertDialogCreate.isShowing()) {
                        alertDialogCreate.dismiss();
                    }
                    synchronized (j0Var) {
                        try {
                            Context context = (Context) j0Var.f2121b;
                            if (context != null) {
                                context.unregisterReceiver(j0Var);
                            }
                            j0Var.f2121b = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                return;
            case 1:
                g7.b bVar2 = (g7.b) this.f2060b;
                h0 h0Var = (h0) this.f2061c;
                com.google.android.gms.common.api.g gVar = (com.google.android.gms.common.api.g) h0Var.f2115b;
                f0 f0Var = (f0) ((h) h0Var.f2118f).f2108u.get((a) h0Var.f2116c);
                if (f0Var == null) {
                    return;
                }
                if (bVar2.f4229b != 0) {
                    f0Var.m(bVar2, null);
                    return;
                }
                h0Var.f2114a = true;
                if (gVar.requiresSignIn()) {
                    if (!h0Var.f2114a || (nVar = (com.google.android.gms.common.internal.n) h0Var.f2117d) == null) {
                        return;
                    }
                    gVar.getRemoteService(nVar, (Set) h0Var.e);
                    return;
                }
                try {
                    gVar.getRemoteService(null, gVar.getScopesForConnectionlessNonSignIn());
                    return;
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    gVar.disconnect("Failed to get service from broker.");
                    f0Var.m(new g7.b(10), null);
                    return;
                }
            case 2:
                o oVar = (o) this.f2060b;
                n nVar2 = (n) this.f2061c;
                Object obj = oVar.f2131b;
                if (obj == null) {
                    nVar2.onNotifyListenerFailed();
                    return;
                }
                try {
                    nVar2.notifyListener(obj);
                    return;
                } catch (RuntimeException e4) {
                    nVar2.onNotifyListenerFailed();
                    throw e4;
                }
            default:
                q0 q0Var = (q0) this.f2061c;
                b8.h hVar = (b8.h) this.f2060b;
                g7.b bVar3 = hVar.f1433b;
                if (bVar3.f4229b == 0) {
                    com.google.android.gms.common.internal.b0 b0Var = hVar.f1434c;
                    com.google.android.gms.common.internal.i0.i(b0Var);
                    g7.b bVar4 = b0Var.f2180c;
                    if (bVar4.f4229b != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar4)), new Exception());
                        q0Var.f2146r.d(bVar4);
                        q0Var.f2145f.disconnect();
                        return;
                    }
                    h0 h0Var2 = q0Var.f2146r;
                    IBinder iBinder = b0Var.f2179b;
                    if (iBinder != null) {
                        int i12 = com.google.android.gms.common.internal.a.f2173a;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        v0Var = iInterfaceQueryLocalInterface instanceof com.google.android.gms.common.internal.n ? (com.google.android.gms.common.internal.n) iInterfaceQueryLocalInterface : new com.google.android.gms.common.internal.v0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                    }
                    Set set = q0Var.f2144d;
                    h0Var2.getClass();
                    if (v0Var == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        h0Var2.d(new g7.b(4));
                    } else {
                        h0Var2.f2117d = v0Var;
                        h0Var2.e = set;
                        if (h0Var2.f2114a) {
                            ((com.google.android.gms.common.api.g) h0Var2.f2115b).getRemoteService(v0Var, set);
                        }
                    }
                } else {
                    q0Var.f2146r.d(bVar3);
                }
                q0Var.f2145f.disconnect();
                return;
        }
    }

    public /* synthetic */ a1(o oVar, n nVar) {
        this.f2059a = 2;
        this.f2060b = oVar;
        this.f2061c = nVar;
    }
}

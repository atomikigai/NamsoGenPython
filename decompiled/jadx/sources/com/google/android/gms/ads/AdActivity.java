package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzbtg;
import e6.c;
import e6.q;
import e6.s;
import i6.h;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class AdActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zzbtg f1959a;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i10, Intent intent) {
        try {
            zzbtg zzbtgVar = this.f1959a;
            if (zzbtgVar != null) {
                zzbtgVar.zzh(i, i10, intent);
            }
        } catch (Exception e) {
            h.i("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i10, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbtg zzbtgVar = this.f1959a;
            if (zzbtgVar != null && !zzbtgVar.zzH()) {
                return;
            }
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            zzbtg zzbtgVar2 = this.f1959a;
            if (zzbtgVar2 != null) {
                zzbtgVar2.zzi();
            }
        } catch (RemoteException e4) {
            h.i("#007 Could not call remote method.", e4);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbtg zzbtgVar = this.f1959a;
            if (zzbtgVar != null) {
                zzbtgVar.zzk(new b(configuration));
            }
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        q qVar = s.f3427f.f3429b;
        qVar.getClass();
        c cVar = new c(qVar, this);
        Intent intent = getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            h.d("useClientJar flag not found in activity intent extras.");
        }
        zzbtg zzbtgVar = (zzbtg) cVar.d(this, booleanExtra);
        this.f1959a = zzbtgVar;
        if (zzbtgVar == null) {
            h.i("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            zzbtgVar.zzl(bundle);
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        try {
            zzbtg zzbtgVar = this.f1959a;
            if (zzbtgVar != null) {
                zzbtgVar.zzm();
            }
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        try {
            zzbtg zzbtgVar = this.f1959a;
            if (zzbtgVar != null) {
                zzbtgVar.zzo();
            }
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            zzbtg zzbtgVar = this.f1959a;
            if (zzbtgVar != null) {
                zzbtgVar.zzp(i, strArr, iArr);
            }
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        try {
            zzbtg zzbtgVar = this.f1959a;
            if (zzbtgVar != null) {
                zzbtgVar.zzq();
            }
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            zzbtg zzbtgVar = this.f1959a;
            if (zzbtgVar != null) {
                zzbtgVar.zzr();
            }
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            zzbtg zzbtgVar = this.f1959a;
            if (zzbtgVar != null) {
                zzbtgVar.zzs(bundle);
            }
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        try {
            zzbtg zzbtgVar = this.f1959a;
            if (zzbtgVar != null) {
                zzbtgVar.zzt();
            }
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        try {
            zzbtg zzbtgVar = this.f1959a;
            if (zzbtgVar != null) {
                zzbtgVar.zzu();
            }
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbtg zzbtgVar = this.f1959a;
            if (zzbtgVar != null) {
                zzbtgVar.zzv();
            }
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        zzbtg zzbtgVar = this.f1959a;
        if (zzbtgVar != null) {
            try {
                zzbtgVar.zzx();
            } catch (RemoteException e) {
                h.i("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        zzbtg zzbtgVar = this.f1959a;
        if (zzbtgVar != null) {
            try {
                zzbtgVar.zzx();
            } catch (RemoteException e) {
                h.i("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zzbtg zzbtgVar = this.f1959a;
        if (zzbtgVar != null) {
            try {
                zzbtgVar.zzx();
            } catch (RemoteException e) {
                h.i("#007 Could not call remote method.", e);
            }
        }
    }
}

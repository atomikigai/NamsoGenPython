package com.google.android.gms.auth.api.signin.internal;

import a2.l;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.w;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import e7.b;
import e7.d;
import e7.i;
import ea.e;
import java.lang.reflect.Modifier;
import java.util.Set;
import m1.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class SignInHubActivity extends w {
    public static boolean O = false;
    public boolean J = false;
    public SignInConfiguration K;
    public boolean L;
    public int M;
    public Intent N;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.w, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i, int i10, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.J) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.f2033b) != null) {
                i iVarF = i.F(this);
                GoogleSignInOptions googleSignInOptions = this.K.f2036b;
                synchronized (iVarF) {
                    ((b) iVarF.f3489b).c(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.L = true;
                this.M = i10;
                this.N = intent;
                r();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                s(intExtra);
                return;
            }
        }
        s(8);
    }

    @Override // androidx.fragment.app.w, androidx.activity.m, d0.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            s(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        bundleExtra.getClass();
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.K = signInConfiguration;
        if (bundle != null) {
            boolean z4 = bundle.getBoolean("signingInGoogleApiClients");
            this.L = z4;
            if (z4) {
                this.M = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                intent2.getClass();
                this.N = intent2;
                r();
                return;
            }
            return;
        }
        if (O) {
            setResult(0);
            s(12502);
            return;
        }
        O = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.K);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.J = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            s(17);
        }
    }

    @Override // androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        O = false;
    }

    @Override // androidx.activity.m, d0.i, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.L);
        if (this.L) {
            bundle.putInt("signInResultCode", this.M);
            bundle.putParcelable("signInResultData", this.N);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void r() {
        m1.b bVar = (m1.b) new l(f(), m1.b.f6978f).q(m1.b.class);
        a4.b bVar2 = new a4.b(this, 10);
        boolean z4 = bVar.e;
        r.l lVar = bVar.f6979d;
        if (z4) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a aVar = (a) lVar.b(0);
        if (aVar == null) {
            try {
                bVar.e = true;
                Set set = o.f2170a;
                synchronized (set) {
                }
                d dVar = new d(this, set);
                if (d.class.isMemberClass() && !Modifier.isStatic(d.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + dVar);
                }
                a aVar2 = new a(dVar);
                lVar.c(0, aVar2);
                bVar.e = false;
                e eVar = new e(aVar2.f6975l, bVar2);
                aVar2.d(this, eVar);
                e eVar2 = aVar2.f6977n;
                if (eVar2 != null) {
                    aVar2.i(eVar2);
                }
                aVar2.f6976m = this;
                aVar2.f6977n = eVar;
            } catch (Throwable th) {
                bVar.e = false;
                throw th;
            }
        } else {
            e eVar3 = new e(aVar.f6975l, bVar2);
            aVar.d(this, eVar3);
            e eVar4 = aVar.f6977n;
            if (eVar4 != null) {
                aVar.i(eVar4);
            }
            aVar.f6976m = this;
            aVar.f6977n = eVar3;
        }
        O = false;
    }

    public final void s(int i) {
        Status status = new Status(i, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        O = false;
    }
}

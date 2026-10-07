package app.namso_gen.spacehowen;

import android.accounts.Account;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.o;
import androidx.activity.result.d;
import androidx.fragment.app.e0;
import app.namso_gen.spacehowen.NotificationHistoryActivity;
import app.namso_gen.spacehowen.R;
import app.namso_gen.spacehowen.SettingsActivity;
import app.namso_gen.spacehowen.ui.browser.ProfileViewerActivity;
import b9.e;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.i0;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.FirebaseAuth;
import d4.m;
import d7.a;
import g.g;
import g.l;
import h3.j2;
import h3.m2;
import h3.o2;
import h3.q2;
import h3.t;
import i3.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import n3.i;
import o3.b;
import o3.j;
import o3.k;
import rc.b0;
import u3.f;
import v9.n;
import w9.d0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class SettingsActivity extends g {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static int f1300e0;
    public FirebaseAuth K;
    public a L;
    public b M;
    public k N;
    public boolean O;
    public LinearLayout P;
    public LinearLayout Q;
    public ImageView R;
    public TextView S;
    public TextView T;
    public TextView U;
    public TextView V;
    public Button W;
    public MaterialButton X;
    public Button Y;
    public Button Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public TextView f1301a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final d f1302b0 = (d) o(new j2(this), new e0(5));

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final d f1303c0 = (d) o(new ga.a(18), new e0(2));

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Switch f1304d0;

    public static int t() {
        i iVar = i.f7270a;
        return Math.max(i.a().size(), ProfileViewerActivity.T.size() + ProfileViewerActivity.P.size() + qd.b.f8071c);
    }

    public static void u() {
        i iVar = i.f7270a;
        ArrayList arrayListA = i.a();
        int size = arrayListA.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListA.get(i);
            i++;
            i.f7270a.c(((Number) obj).longValue());
        }
        ConcurrentHashMap concurrentHashMap = ProfileViewerActivity.P;
        LinkedHashSet<Long> linkedHashSet = new LinkedHashSet(new ArrayList(ProfileViewerActivity.P.keySet()));
        ConcurrentHashMap.KeySetView keySetView = ProfileViewerActivity.T;
        jc.i.d(keySetView, "access$getSuspended$cp(...)");
        linkedHashSet.addAll(keySetView);
        for (Long l2 : linkedHashSet) {
            jc.i.b(l2);
            a.a.c(l2.longValue());
        }
        a2.d dVar = qd.b.f8072d;
        if (dVar != null) {
            dVar.a();
        }
    }

    public static j v(k kVar) {
        ArrayList arrayList;
        j jVar = null;
        Object next = null;
        jVar = null;
        jVar = null;
        if (kVar != null && (arrayList = kVar.h) != null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    ArrayList arrayList2 = ((j) next).f7505b.f5977a;
                    jc.i.d(arrayList2, "getPricingPhaseList(...)");
                    o3.i iVar = (o3.i) vb.i.a0(arrayList2);
                    long j4 = iVar != null ? iVar.f7503b : Long.MAX_VALUE;
                    do {
                        Object next2 = it.next();
                        ArrayList arrayList3 = ((j) next2).f7505b.f5977a;
                        jc.i.d(arrayList3, "getPricingPhaseList(...)");
                        o3.i iVar2 = (o3.i) vb.i.a0(arrayList3);
                        long j10 = iVar2 != null ? iVar2.f7503b : Long.MAX_VALUE;
                        if (j4 > j10) {
                            next = next2;
                            j4 = j10;
                        }
                    } while (it.hasNext());
                }
            }
            jVar = (j) next;
            if (jVar == null) {
                return (j) vb.i.a0(arrayList);
            }
        }
        return jVar;
    }

    public final Switch A() {
        if (this.f1304d0 == null) {
            this.f1304d0 = (Switch) findViewById(R.id.switchSwipeTabs);
        }
        return this.f1304d0;
    }

    public final void B() {
        Switch r10 = (Switch) findViewById(R.id.switchViewerEmbedded);
        boolean zIsChecked = r10.isChecked();
        SharedPreferences sharedPreferences = p.f5195a;
        if (sharedPreferences == null) {
            throw new IllegalStateException("Prefs.init(context) no llamado");
        }
        if (zIsChecked != sharedPreferences.getBoolean("viewer_embedded", true)) {
            SharedPreferences sharedPreferences2 = p.f5195a;
            if (sharedPreferences2 == null) {
                throw new IllegalStateException("Prefs.init(context) no llamado");
            }
            r10.setChecked(sharedPreferences2.getBoolean("viewer_embedded", true));
        }
    }

    public final void C() {
        TextView textView = (TextView) findViewById(R.id.txtSubscriptionStatus);
        View viewFindViewById = findViewById(R.id.layoutSubscriptionFree);
        View viewFindViewById2 = findViewById(R.id.layoutSubscriptionPremium);
        TextView textView2 = (TextView) findViewById(R.id.txtSubscriptionBadge);
        if (this.O || getSharedPreferences("app_settings", 0).getBoolean("is_premium_cached", false)) {
            textView.setText(getString(R.string.settings_premium_active));
            textView.setTextColor(-10496);
            textView.setTextSize(14.0f);
            textView2.setVisibility(0);
            viewFindViewById.setVisibility(8);
            viewFindViewById2.setVisibility(0);
            return;
        }
        textView.setText(getString(R.string.settings_free_version));
        textView.setTextColor(-4473925);
        textView.setTextSize(13.0f);
        textView2.setVisibility(8);
        viewFindViewById.setVisibility(0);
        viewFindViewById2.setVisibility(8);
    }

    @Override // g.g, androidx.fragment.app.w, androidx.activity.m, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        jc.i.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Log.d("SettingsLang", "onConfigurationChanged | newLocales='" + configuration.getLocales() + "' | applicationLocales='" + l.b().c() + '\'');
    }

    @Override // androidx.fragment.app.w, androidx.activity.m, d0.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        PackageInfo packageInfo;
        super.onCreate(bundle);
        int i = f1300e0;
        f1300e0 = i + 1;
        Log.d("SettingsLang", "onCreate #" + i + " | applicationLocales='" + l.b().c() + "' | configLocales='" + getResources().getConfiguration().getLocales() + '\'');
        o.a(this);
        setContentView(R.layout.activity_settings);
        this.K = FirebaseAuth.getInstance();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f2018v;
        new HashSet();
        new HashMap();
        i0.i(googleSignInOptions);
        HashSet hashSet = new HashSet(googleSignInOptions.f2024b);
        boolean z4 = googleSignInOptions.e;
        boolean z10 = googleSignInOptions.f2027f;
        String str = googleSignInOptions.f2028r;
        Account account = googleSignInOptions.f2025c;
        String str2 = googleSignInOptions.f2029s;
        HashMap mapH = GoogleSignInOptions.h(googleSignInOptions.f2030t);
        String str3 = googleSignInOptions.f2031u;
        String string = getString(R.string.default_web_client_id);
        i0.e(string);
        final int i10 = 0;
        i0.a("two different server client ids provided", str == null || str.equals(string));
        hashSet.add(GoogleSignInOptions.f2019w);
        if (hashSet.contains(GoogleSignInOptions.f2022z)) {
            Scope scope = GoogleSignInOptions.f2021y;
            if (hashSet.contains(scope)) {
                hashSet.remove(scope);
            }
        }
        if (account == null || !hashSet.isEmpty()) {
            hashSet.add(GoogleSignInOptions.f2020x);
        }
        this.L = new a(this, x6.b.f10299b, new GoogleSignInOptions(3, new ArrayList(hashSet), account, true, z4, z10, string, str2, mapH, str3), new e(8));
        this.P = (LinearLayout) findViewById(R.id.sectionProfile);
        this.Q = (LinearLayout) findViewById(R.id.sectionLogin);
        this.R = (ImageView) findViewById(R.id.imgProfile);
        this.S = (TextView) findViewById(R.id.txtName);
        this.T = (TextView) findViewById(R.id.txtEmail);
        this.U = (TextView) findViewById(R.id.txtCoins);
        this.V = (TextView) findViewById(R.id.txtMb);
        this.W = (Button) findViewById(R.id.btnSignOut);
        MaterialButton materialButton = (MaterialButton) findViewById(R.id.btnSignIn);
        this.X = materialButton;
        if (materialButton == null) {
            jc.i.i("btnSignIn");
            throw null;
        }
        materialButton.setIconTint(null);
        this.Y = (Button) findViewById(R.id.btnSpanish);
        this.Z = (Button) findViewById(R.id.btnEnglish);
        this.f1301a0 = (TextView) findViewById(R.id.txtVersion);
        Switch r10 = (Switch) findViewById(R.id.switchNotifications);
        final int i11 = 2;
        ((ImageView) findViewById(R.id.btnBack)).setOnClickListener(new View.OnClickListener(this) { // from class: h3.k2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f4753b;

            {
                this.f4753b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i11;
                int i13 = 13;
                yb.d dVar = null;
                boolean z11 = false;
                SettingsActivity settingsActivity = this.f4753b;
                switch (i12) {
                    case 0:
                        int i14 = SettingsActivity.f1300e0;
                        settingsActivity.startActivity(new Intent(settingsActivity, (Class<?>) NotificationHistoryActivity.class));
                        return;
                    case 1:
                        o3.k kVar = settingsActivity.N;
                        if (kVar == null) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.error_billing_connection), 0).show();
                            settingsActivity.x();
                            return;
                        }
                        o3.j jVarV = SettingsActivity.v(kVar);
                        String str4 = jVarV != null ? jVarV.f7504a : null;
                        if (str4 == null || str4.length() == 0) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.error_no_valid_offer), 0).show();
                            return;
                        }
                        h6.o0 o0Var = new h6.o0(18, z11);
                        o0Var.o(kVar);
                        if (TextUtils.isEmpty(str4)) {
                            throw new IllegalArgumentException("offerToken can not be empty");
                        }
                        o0Var.f5062c = str4;
                        o3.d dVarC = o0Var.c();
                        h6.o0 o0VarE = com.bumptech.glide.manager.q.e();
                        o0VarE.f5061b = new ArrayList(jd.d.D(dVarC));
                        com.bumptech.glide.manager.q qVarB = o0VarE.b();
                        o3.b bVar = settingsActivity.M;
                        if (bVar != null) {
                            bVar.w(settingsActivity, qVarB);
                            return;
                        } else {
                            jc.i.i("billingClient");
                            throw null;
                        }
                    case 2:
                        int i15 = SettingsActivity.f1300e0;
                        settingsActivity.finish();
                        return;
                    case 3:
                        int i16 = SettingsActivity.f1300e0;
                        settingsActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?package=" + settingsActivity.getPackageName())));
                        return;
                    case 4:
                        FirebaseAuth firebaseAuth = settingsActivity.K;
                        if (firebaseAuth == null) {
                            jc.i.i("auth");
                            throw null;
                        }
                        firebaseAuth.d();
                        d7.a aVar = settingsActivity.L;
                        if (aVar == null) {
                            jc.i.i("googleSignInClient");
                            throw null;
                        }
                        aVar.signOut();
                        SettingsActivity.u();
                        Toast.makeText(settingsActivity, settingsActivity.getString(R.string.sign_out_success), 0).show();
                        settingsActivity.finish();
                        return;
                    case 5:
                        int i17 = SettingsActivity.f1300e0;
                        ArrayList arrayListQ = vb.j.Q(new h6.o0(29).d());
                        r4.d dVar2 = new r4.d(r4.e.a(n9.g.d()));
                        dVar2.b(arrayListQ);
                        dVar2.f8150d = false;
                        dVar2.e = false;
                        settingsActivity.f1302b0.a(dVar2.a());
                        return;
                    case 6:
                        int i18 = SettingsActivity.f1300e0;
                        String strC = g.l.b().c();
                        jc.i.d(strC, "toLanguageTags(...)");
                        Log.d("SettingsLang", "btnSpanish presionado | tags='" + strC + '\'');
                        String str5 = "es";
                        if (pc.g.f0(strC, "es", false)) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.language_already_selected), 0).show();
                            return;
                        }
                        Button button = settingsActivity.Y;
                        if (button == null) {
                            jc.i.i("btnSpanish");
                            throw null;
                        }
                        button.setEnabled(false);
                        rc.b0.q(androidx.lifecycle.i0.e(settingsActivity), null, new a2.g(str5, settingsActivity, dVar, i13), 3);
                        return;
                    default:
                        int i19 = SettingsActivity.f1300e0;
                        String strC2 = g.l.b().c();
                        jc.i.d(strC2, "toLanguageTags(...)");
                        Log.d("SettingsLang", "btnEnglish presionado | tags='" + strC2 + '\'');
                        String str6 = "en";
                        if (pc.g.f0(strC2, "en", false)) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.language_already_selected), 0).show();
                            return;
                        }
                        Button button2 = settingsActivity.Z;
                        if (button2 == null) {
                            jc.i.i("btnEnglish");
                            throw null;
                        }
                        button2.setEnabled(false);
                        rc.b0.q(androidx.lifecycle.i0.e(settingsActivity), null, new a2.g(str6, settingsActivity, dVar, i13), 3);
                        return;
                }
            }
        });
        FirebaseAuth firebaseAuth = this.K;
        if (firebaseAuth == null) {
            jc.i.i("auth");
            throw null;
        }
        n nVar = firebaseAuth.f2702f;
        if (nVar != null) {
            LinearLayout linearLayout = this.P;
            if (linearLayout == null) {
                jc.i.i("sectionProfile");
                throw null;
            }
            linearLayout.setVisibility(0);
            LinearLayout linearLayout2 = this.Q;
            if (linearLayout2 == null) {
                jc.i.i("sectionLogin");
                throw null;
            }
            linearLayout2.setVisibility(8);
            TextView textView = this.S;
            if (textView == null) {
                jc.i.i("txtName");
                throw null;
            }
            d0 d0Var = (d0) nVar;
            String string2 = d0Var.f9820b.f9808c;
            if (string2 == null) {
                string2 = getString(R.string.profile_no_name);
                jc.i.d(string2, "getString(...)");
            }
            textView.setText(string2);
            TextView textView2 = this.T;
            if (textView2 == null) {
                jc.i.i("txtEmail");
                throw null;
            }
            String string3 = d0Var.f9820b.f9810f;
            if (string3 == null) {
                string3 = getString(R.string.profile_no_email);
                jc.i.d(string3, "getString(...)");
            }
            textView2.setText(string3);
            Uri uriH = nVar.h();
            if (uriH != null) {
                com.bumptech.glide.l lVarD = com.bumptech.glide.b.a(this).e.d(this);
                lVarD.getClass();
                com.bumptech.glide.j jVar = new com.bumptech.glide.j(lVarD.f1878a, lVarD, Drawable.class, lVarD.f1879b);
                com.bumptech.glide.j jVarA = jVar.A(uriH);
                if ("android.resource".equals(uriH.getScheme())) {
                    Context context = jVar.C;
                    com.bumptech.glide.j jVar2 = (com.bumptech.glide.j) jVarA.p(context.getTheme());
                    ConcurrentHashMap concurrentHashMap = o4.b.f7555a;
                    String packageName = context.getPackageName();
                    ConcurrentHashMap concurrentHashMap2 = o4.b.f7555a;
                    f fVar = (f) concurrentHashMap2.get(packageName);
                    if (fVar == null) {
                        try {
                            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e);
                            packageInfo = null;
                        }
                        o4.d dVar = new o4.d(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
                        fVar = (f) concurrentHashMap2.putIfAbsent(packageName, dVar);
                        if (fVar == null) {
                            fVar = dVar;
                        }
                    }
                    jVarA = (com.bumptech.glide.j) jVar2.n(new o4.a(context.getResources().getConfiguration().uiMode & 48, fVar));
                }
                com.bumptech.glide.j jVar3 = (com.bumptech.glide.j) jVarA.i();
                jVar3.getClass();
                m mVar = m.f2882b;
                com.bumptech.glide.j jVar4 = (com.bumptech.glide.j) jVar3.q(new d4.i());
                ImageView imageView = this.R;
                if (imageView == null) {
                    jc.i.i("imgProfile");
                    throw null;
                }
                jVar4.y(imageView);
            } else {
                ImageView imageView2 = this.R;
                if (imageView2 == null) {
                    jc.i.i("imgProfile");
                    throw null;
                }
                imageView2.setImageResource(R.drawable.ic_profile_placeholder);
            }
            w();
        } else {
            LinearLayout linearLayout3 = this.P;
            if (linearLayout3 == null) {
                jc.i.i("sectionProfile");
                throw null;
            }
            linearLayout3.setVisibility(8);
            LinearLayout linearLayout4 = this.Q;
            if (linearLayout4 == null) {
                jc.i.i("sectionLogin");
                throw null;
            }
            linearLayout4.setVisibility(0);
        }
        Button button = this.W;
        if (button == null) {
            jc.i.i("btnSignOut");
            throw null;
        }
        final int i12 = 4;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: h3.k2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f4753b;

            {
                this.f4753b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = i12;
                int i14 = 13;
                yb.d dVar2 = null;
                boolean z11 = false;
                SettingsActivity settingsActivity = this.f4753b;
                switch (i13) {
                    case 0:
                        int i15 = SettingsActivity.f1300e0;
                        settingsActivity.startActivity(new Intent(settingsActivity, (Class<?>) NotificationHistoryActivity.class));
                        return;
                    case 1:
                        o3.k kVar = settingsActivity.N;
                        if (kVar == null) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.error_billing_connection), 0).show();
                            settingsActivity.x();
                            return;
                        }
                        o3.j jVarV = SettingsActivity.v(kVar);
                        String str4 = jVarV != null ? jVarV.f7504a : null;
                        if (str4 == null || str4.length() == 0) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.error_no_valid_offer), 0).show();
                            return;
                        }
                        h6.o0 o0Var = new h6.o0(18, z11);
                        o0Var.o(kVar);
                        if (TextUtils.isEmpty(str4)) {
                            throw new IllegalArgumentException("offerToken can not be empty");
                        }
                        o0Var.f5062c = str4;
                        o3.d dVarC = o0Var.c();
                        h6.o0 o0VarE = com.bumptech.glide.manager.q.e();
                        o0VarE.f5061b = new ArrayList(jd.d.D(dVarC));
                        com.bumptech.glide.manager.q qVarB = o0VarE.b();
                        o3.b bVar = settingsActivity.M;
                        if (bVar != null) {
                            bVar.w(settingsActivity, qVarB);
                            return;
                        } else {
                            jc.i.i("billingClient");
                            throw null;
                        }
                    case 2:
                        int i16 = SettingsActivity.f1300e0;
                        settingsActivity.finish();
                        return;
                    case 3:
                        int i17 = SettingsActivity.f1300e0;
                        settingsActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?package=" + settingsActivity.getPackageName())));
                        return;
                    case 4:
                        FirebaseAuth firebaseAuth2 = settingsActivity.K;
                        if (firebaseAuth2 == null) {
                            jc.i.i("auth");
                            throw null;
                        }
                        firebaseAuth2.d();
                        d7.a aVar = settingsActivity.L;
                        if (aVar == null) {
                            jc.i.i("googleSignInClient");
                            throw null;
                        }
                        aVar.signOut();
                        SettingsActivity.u();
                        Toast.makeText(settingsActivity, settingsActivity.getString(R.string.sign_out_success), 0).show();
                        settingsActivity.finish();
                        return;
                    case 5:
                        int i18 = SettingsActivity.f1300e0;
                        ArrayList arrayListQ = vb.j.Q(new h6.o0(29).d());
                        r4.d dVar3 = new r4.d(r4.e.a(n9.g.d()));
                        dVar3.b(arrayListQ);
                        dVar3.f8150d = false;
                        dVar3.e = false;
                        settingsActivity.f1302b0.a(dVar3.a());
                        return;
                    case 6:
                        int i19 = SettingsActivity.f1300e0;
                        String strC = g.l.b().c();
                        jc.i.d(strC, "toLanguageTags(...)");
                        Log.d("SettingsLang", "btnSpanish presionado | tags='" + strC + '\'');
                        String str5 = "es";
                        if (pc.g.f0(strC, "es", false)) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.language_already_selected), 0).show();
                            return;
                        }
                        Button button2 = settingsActivity.Y;
                        if (button2 == null) {
                            jc.i.i("btnSpanish");
                            throw null;
                        }
                        button2.setEnabled(false);
                        rc.b0.q(androidx.lifecycle.i0.e(settingsActivity), null, new a2.g(str5, settingsActivity, dVar2, i14), 3);
                        return;
                    default:
                        int i110 = SettingsActivity.f1300e0;
                        String strC2 = g.l.b().c();
                        jc.i.d(strC2, "toLanguageTags(...)");
                        Log.d("SettingsLang", "btnEnglish presionado | tags='" + strC2 + '\'');
                        String str6 = "en";
                        if (pc.g.f0(strC2, "en", false)) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.language_already_selected), 0).show();
                            return;
                        }
                        Button button3 = settingsActivity.Z;
                        if (button3 == null) {
                            jc.i.i("btnEnglish");
                            throw null;
                        }
                        button3.setEnabled(false);
                        rc.b0.q(androidx.lifecycle.i0.e(settingsActivity), null, new a2.g(str6, settingsActivity, dVar2, i14), 3);
                        return;
                }
            }
        });
        MaterialButton materialButton2 = this.X;
        if (materialButton2 == null) {
            jc.i.i("btnSignIn");
            throw null;
        }
        final int i13 = 5;
        materialButton2.setOnClickListener(new View.OnClickListener(this) { // from class: h3.k2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f4753b;

            {
                this.f4753b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                int i15 = 13;
                yb.d dVar2 = null;
                boolean z11 = false;
                SettingsActivity settingsActivity = this.f4753b;
                switch (i14) {
                    case 0:
                        int i16 = SettingsActivity.f1300e0;
                        settingsActivity.startActivity(new Intent(settingsActivity, (Class<?>) NotificationHistoryActivity.class));
                        return;
                    case 1:
                        o3.k kVar = settingsActivity.N;
                        if (kVar == null) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.error_billing_connection), 0).show();
                            settingsActivity.x();
                            return;
                        }
                        o3.j jVarV = SettingsActivity.v(kVar);
                        String str4 = jVarV != null ? jVarV.f7504a : null;
                        if (str4 == null || str4.length() == 0) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.error_no_valid_offer), 0).show();
                            return;
                        }
                        h6.o0 o0Var = new h6.o0(18, z11);
                        o0Var.o(kVar);
                        if (TextUtils.isEmpty(str4)) {
                            throw new IllegalArgumentException("offerToken can not be empty");
                        }
                        o0Var.f5062c = str4;
                        o3.d dVarC = o0Var.c();
                        h6.o0 o0VarE = com.bumptech.glide.manager.q.e();
                        o0VarE.f5061b = new ArrayList(jd.d.D(dVarC));
                        com.bumptech.glide.manager.q qVarB = o0VarE.b();
                        o3.b bVar = settingsActivity.M;
                        if (bVar != null) {
                            bVar.w(settingsActivity, qVarB);
                            return;
                        } else {
                            jc.i.i("billingClient");
                            throw null;
                        }
                    case 2:
                        int i17 = SettingsActivity.f1300e0;
                        settingsActivity.finish();
                        return;
                    case 3:
                        int i18 = SettingsActivity.f1300e0;
                        settingsActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?package=" + settingsActivity.getPackageName())));
                        return;
                    case 4:
                        FirebaseAuth firebaseAuth2 = settingsActivity.K;
                        if (firebaseAuth2 == null) {
                            jc.i.i("auth");
                            throw null;
                        }
                        firebaseAuth2.d();
                        d7.a aVar = settingsActivity.L;
                        if (aVar == null) {
                            jc.i.i("googleSignInClient");
                            throw null;
                        }
                        aVar.signOut();
                        SettingsActivity.u();
                        Toast.makeText(settingsActivity, settingsActivity.getString(R.string.sign_out_success), 0).show();
                        settingsActivity.finish();
                        return;
                    case 5:
                        int i19 = SettingsActivity.f1300e0;
                        ArrayList arrayListQ = vb.j.Q(new h6.o0(29).d());
                        r4.d dVar3 = new r4.d(r4.e.a(n9.g.d()));
                        dVar3.b(arrayListQ);
                        dVar3.f8150d = false;
                        dVar3.e = false;
                        settingsActivity.f1302b0.a(dVar3.a());
                        return;
                    case 6:
                        int i110 = SettingsActivity.f1300e0;
                        String strC = g.l.b().c();
                        jc.i.d(strC, "toLanguageTags(...)");
                        Log.d("SettingsLang", "btnSpanish presionado | tags='" + strC + '\'');
                        String str5 = "es";
                        if (pc.g.f0(strC, "es", false)) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.language_already_selected), 0).show();
                            return;
                        }
                        Button button2 = settingsActivity.Y;
                        if (button2 == null) {
                            jc.i.i("btnSpanish");
                            throw null;
                        }
                        button2.setEnabled(false);
                        rc.b0.q(androidx.lifecycle.i0.e(settingsActivity), null, new a2.g(str5, settingsActivity, dVar2, i15), 3);
                        return;
                    default:
                        int i111 = SettingsActivity.f1300e0;
                        String strC2 = g.l.b().c();
                        jc.i.d(strC2, "toLanguageTags(...)");
                        Log.d("SettingsLang", "btnEnglish presionado | tags='" + strC2 + '\'');
                        String str6 = "en";
                        if (pc.g.f0(strC2, "en", false)) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.language_already_selected), 0).show();
                            return;
                        }
                        Button button3 = settingsActivity.Z;
                        if (button3 == null) {
                            jc.i.i("btnEnglish");
                            throw null;
                        }
                        button3.setEnabled(false);
                        rc.b0.q(androidx.lifecycle.i0.e(settingsActivity), null, new a2.g(str6, settingsActivity, dVar2, i15), 3);
                        return;
                }
            }
        });
        Button button2 = this.Y;
        if (button2 == null) {
            jc.i.i("btnSpanish");
            throw null;
        }
        final int i14 = 6;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: h3.k2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f4753b;

            {
                this.f4753b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i14;
                int i16 = 13;
                yb.d dVar2 = null;
                boolean z11 = false;
                SettingsActivity settingsActivity = this.f4753b;
                switch (i15) {
                    case 0:
                        int i17 = SettingsActivity.f1300e0;
                        settingsActivity.startActivity(new Intent(settingsActivity, (Class<?>) NotificationHistoryActivity.class));
                        return;
                    case 1:
                        o3.k kVar = settingsActivity.N;
                        if (kVar == null) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.error_billing_connection), 0).show();
                            settingsActivity.x();
                            return;
                        }
                        o3.j jVarV = SettingsActivity.v(kVar);
                        String str4 = jVarV != null ? jVarV.f7504a : null;
                        if (str4 == null || str4.length() == 0) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.error_no_valid_offer), 0).show();
                            return;
                        }
                        h6.o0 o0Var = new h6.o0(18, z11);
                        o0Var.o(kVar);
                        if (TextUtils.isEmpty(str4)) {
                            throw new IllegalArgumentException("offerToken can not be empty");
                        }
                        o0Var.f5062c = str4;
                        o3.d dVarC = o0Var.c();
                        h6.o0 o0VarE = com.bumptech.glide.manager.q.e();
                        o0VarE.f5061b = new ArrayList(jd.d.D(dVarC));
                        com.bumptech.glide.manager.q qVarB = o0VarE.b();
                        o3.b bVar = settingsActivity.M;
                        if (bVar != null) {
                            bVar.w(settingsActivity, qVarB);
                            return;
                        } else {
                            jc.i.i("billingClient");
                            throw null;
                        }
                    case 2:
                        int i18 = SettingsActivity.f1300e0;
                        settingsActivity.finish();
                        return;
                    case 3:
                        int i19 = SettingsActivity.f1300e0;
                        settingsActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?package=" + settingsActivity.getPackageName())));
                        return;
                    case 4:
                        FirebaseAuth firebaseAuth2 = settingsActivity.K;
                        if (firebaseAuth2 == null) {
                            jc.i.i("auth");
                            throw null;
                        }
                        firebaseAuth2.d();
                        d7.a aVar = settingsActivity.L;
                        if (aVar == null) {
                            jc.i.i("googleSignInClient");
                            throw null;
                        }
                        aVar.signOut();
                        SettingsActivity.u();
                        Toast.makeText(settingsActivity, settingsActivity.getString(R.string.sign_out_success), 0).show();
                        settingsActivity.finish();
                        return;
                    case 5:
                        int i110 = SettingsActivity.f1300e0;
                        ArrayList arrayListQ = vb.j.Q(new h6.o0(29).d());
                        r4.d dVar3 = new r4.d(r4.e.a(n9.g.d()));
                        dVar3.b(arrayListQ);
                        dVar3.f8150d = false;
                        dVar3.e = false;
                        settingsActivity.f1302b0.a(dVar3.a());
                        return;
                    case 6:
                        int i111 = SettingsActivity.f1300e0;
                        String strC = g.l.b().c();
                        jc.i.d(strC, "toLanguageTags(...)");
                        Log.d("SettingsLang", "btnSpanish presionado | tags='" + strC + '\'');
                        String str5 = "es";
                        if (pc.g.f0(strC, "es", false)) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.language_already_selected), 0).show();
                            return;
                        }
                        Button button3 = settingsActivity.Y;
                        if (button3 == null) {
                            jc.i.i("btnSpanish");
                            throw null;
                        }
                        button3.setEnabled(false);
                        rc.b0.q(androidx.lifecycle.i0.e(settingsActivity), null, new a2.g(str5, settingsActivity, dVar2, i16), 3);
                        return;
                    default:
                        int i112 = SettingsActivity.f1300e0;
                        String strC2 = g.l.b().c();
                        jc.i.d(strC2, "toLanguageTags(...)");
                        Log.d("SettingsLang", "btnEnglish presionado | tags='" + strC2 + '\'');
                        String str6 = "en";
                        if (pc.g.f0(strC2, "en", false)) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.language_already_selected), 0).show();
                            return;
                        }
                        Button button4 = settingsActivity.Z;
                        if (button4 == null) {
                            jc.i.i("btnEnglish");
                            throw null;
                        }
                        button4.setEnabled(false);
                        rc.b0.q(androidx.lifecycle.i0.e(settingsActivity), null, new a2.g(str6, settingsActivity, dVar2, i16), 3);
                        return;
                }
            }
        });
        Button button3 = this.Z;
        if (button3 == null) {
            jc.i.i("btnEnglish");
            throw null;
        }
        final int i15 = 7;
        button3.setOnClickListener(new View.OnClickListener(this) { // from class: h3.k2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f4753b;

            {
                this.f4753b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i16 = i15;
                int i17 = 13;
                yb.d dVar2 = null;
                boolean z11 = false;
                SettingsActivity settingsActivity = this.f4753b;
                switch (i16) {
                    case 0:
                        int i18 = SettingsActivity.f1300e0;
                        settingsActivity.startActivity(new Intent(settingsActivity, (Class<?>) NotificationHistoryActivity.class));
                        return;
                    case 1:
                        o3.k kVar = settingsActivity.N;
                        if (kVar == null) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.error_billing_connection), 0).show();
                            settingsActivity.x();
                            return;
                        }
                        o3.j jVarV = SettingsActivity.v(kVar);
                        String str4 = jVarV != null ? jVarV.f7504a : null;
                        if (str4 == null || str4.length() == 0) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.error_no_valid_offer), 0).show();
                            return;
                        }
                        h6.o0 o0Var = new h6.o0(18, z11);
                        o0Var.o(kVar);
                        if (TextUtils.isEmpty(str4)) {
                            throw new IllegalArgumentException("offerToken can not be empty");
                        }
                        o0Var.f5062c = str4;
                        o3.d dVarC = o0Var.c();
                        h6.o0 o0VarE = com.bumptech.glide.manager.q.e();
                        o0VarE.f5061b = new ArrayList(jd.d.D(dVarC));
                        com.bumptech.glide.manager.q qVarB = o0VarE.b();
                        o3.b bVar = settingsActivity.M;
                        if (bVar != null) {
                            bVar.w(settingsActivity, qVarB);
                            return;
                        } else {
                            jc.i.i("billingClient");
                            throw null;
                        }
                    case 2:
                        int i19 = SettingsActivity.f1300e0;
                        settingsActivity.finish();
                        return;
                    case 3:
                        int i110 = SettingsActivity.f1300e0;
                        settingsActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?package=" + settingsActivity.getPackageName())));
                        return;
                    case 4:
                        FirebaseAuth firebaseAuth2 = settingsActivity.K;
                        if (firebaseAuth2 == null) {
                            jc.i.i("auth");
                            throw null;
                        }
                        firebaseAuth2.d();
                        d7.a aVar = settingsActivity.L;
                        if (aVar == null) {
                            jc.i.i("googleSignInClient");
                            throw null;
                        }
                        aVar.signOut();
                        SettingsActivity.u();
                        Toast.makeText(settingsActivity, settingsActivity.getString(R.string.sign_out_success), 0).show();
                        settingsActivity.finish();
                        return;
                    case 5:
                        int i111 = SettingsActivity.f1300e0;
                        ArrayList arrayListQ = vb.j.Q(new h6.o0(29).d());
                        r4.d dVar3 = new r4.d(r4.e.a(n9.g.d()));
                        dVar3.b(arrayListQ);
                        dVar3.f8150d = false;
                        dVar3.e = false;
                        settingsActivity.f1302b0.a(dVar3.a());
                        return;
                    case 6:
                        int i112 = SettingsActivity.f1300e0;
                        String strC = g.l.b().c();
                        jc.i.d(strC, "toLanguageTags(...)");
                        Log.d("SettingsLang", "btnSpanish presionado | tags='" + strC + '\'');
                        String str5 = "es";
                        if (pc.g.f0(strC, "es", false)) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.language_already_selected), 0).show();
                            return;
                        }
                        Button button4 = settingsActivity.Y;
                        if (button4 == null) {
                            jc.i.i("btnSpanish");
                            throw null;
                        }
                        button4.setEnabled(false);
                        rc.b0.q(androidx.lifecycle.i0.e(settingsActivity), null, new a2.g(str5, settingsActivity, dVar2, i17), 3);
                        return;
                    default:
                        int i113 = SettingsActivity.f1300e0;
                        String strC2 = g.l.b().c();
                        jc.i.d(strC2, "toLanguageTags(...)");
                        Log.d("SettingsLang", "btnEnglish presionado | tags='" + strC2 + '\'');
                        String str6 = "en";
                        if (pc.g.f0(strC2, "en", false)) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.language_already_selected), 0).show();
                            return;
                        }
                        Button button5 = settingsActivity.Z;
                        if (button5 == null) {
                            jc.i.i("btnEnglish");
                            throw null;
                        }
                        button5.setEnabled(false);
                        rc.b0.q(androidx.lifecycle.i0.e(settingsActivity), null, new a2.g(str6, settingsActivity, dVar2, i17), 3);
                        return;
                }
            }
        });
        String str4 = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        if (str4 == null) {
            str4 = "?";
        }
        TextView textView3 = this.f1301a0;
        if (textView3 == null) {
            jc.i.i("txtVersion");
            throw null;
        }
        textView3.setText(getString(R.string.settings_version, str4));
        SharedPreferences sharedPreferences = getSharedPreferences("app_settings", 0);
        final int i16 = 1;
        r10.setChecked(sharedPreferences.getBoolean("notifications_enabled", true));
        r10.setOnCheckedChangeListener(new t(sharedPreferences, this, i16));
        Context applicationContext = getApplicationContext();
        jc.i.d(applicationContext, "getApplicationContext(...)");
        if (p.f5195a == null) {
            p.f5195a = applicationContext.getSharedPreferences("krypt_prefs", 0);
        }
        Switch r11 = (Switch) findViewById(R.id.switchViewerEmbedded);
        r11.setChecked(p.b().getBoolean("viewer_embedded", true));
        r11.setOnCheckedChangeListener(new q2(this, i10));
        Switch r12 = (Switch) findViewById(R.id.switchSwipeTabs);
        r12.setChecked(!p.b().getBoolean("tabs_swipe_enabled", false));
        final int i17 = 3;
        r12.setOnClickListener(new h3.d0(i17, r12, this));
        r12.setOnCheckedChangeListener(null);
        ((LinearLayout) findViewById(R.id.cardNotificationHistory)).setOnClickListener(new View.OnClickListener(this) { // from class: h3.k2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f4753b;

            {
                this.f4753b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i18 = i10;
                int i19 = 13;
                yb.d dVar2 = null;
                boolean z11 = false;
                SettingsActivity settingsActivity = this.f4753b;
                switch (i18) {
                    case 0:
                        int i110 = SettingsActivity.f1300e0;
                        settingsActivity.startActivity(new Intent(settingsActivity, (Class<?>) NotificationHistoryActivity.class));
                        return;
                    case 1:
                        o3.k kVar = settingsActivity.N;
                        if (kVar == null) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.error_billing_connection), 0).show();
                            settingsActivity.x();
                            return;
                        }
                        o3.j jVarV = SettingsActivity.v(kVar);
                        String str5 = jVarV != null ? jVarV.f7504a : null;
                        if (str5 == null || str5.length() == 0) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.error_no_valid_offer), 0).show();
                            return;
                        }
                        h6.o0 o0Var = new h6.o0(18, z11);
                        o0Var.o(kVar);
                        if (TextUtils.isEmpty(str5)) {
                            throw new IllegalArgumentException("offerToken can not be empty");
                        }
                        o0Var.f5062c = str5;
                        o3.d dVarC = o0Var.c();
                        h6.o0 o0VarE = com.bumptech.glide.manager.q.e();
                        o0VarE.f5061b = new ArrayList(jd.d.D(dVarC));
                        com.bumptech.glide.manager.q qVarB = o0VarE.b();
                        o3.b bVar = settingsActivity.M;
                        if (bVar != null) {
                            bVar.w(settingsActivity, qVarB);
                            return;
                        } else {
                            jc.i.i("billingClient");
                            throw null;
                        }
                    case 2:
                        int i111 = SettingsActivity.f1300e0;
                        settingsActivity.finish();
                        return;
                    case 3:
                        int i112 = SettingsActivity.f1300e0;
                        settingsActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?package=" + settingsActivity.getPackageName())));
                        return;
                    case 4:
                        FirebaseAuth firebaseAuth2 = settingsActivity.K;
                        if (firebaseAuth2 == null) {
                            jc.i.i("auth");
                            throw null;
                        }
                        firebaseAuth2.d();
                        d7.a aVar = settingsActivity.L;
                        if (aVar == null) {
                            jc.i.i("googleSignInClient");
                            throw null;
                        }
                        aVar.signOut();
                        SettingsActivity.u();
                        Toast.makeText(settingsActivity, settingsActivity.getString(R.string.sign_out_success), 0).show();
                        settingsActivity.finish();
                        return;
                    case 5:
                        int i113 = SettingsActivity.f1300e0;
                        ArrayList arrayListQ = vb.j.Q(new h6.o0(29).d());
                        r4.d dVar3 = new r4.d(r4.e.a(n9.g.d()));
                        dVar3.b(arrayListQ);
                        dVar3.f8150d = false;
                        dVar3.e = false;
                        settingsActivity.f1302b0.a(dVar3.a());
                        return;
                    case 6:
                        int i114 = SettingsActivity.f1300e0;
                        String strC = g.l.b().c();
                        jc.i.d(strC, "toLanguageTags(...)");
                        Log.d("SettingsLang", "btnSpanish presionado | tags='" + strC + '\'');
                        String str6 = "es";
                        if (pc.g.f0(strC, "es", false)) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.language_already_selected), 0).show();
                            return;
                        }
                        Button button4 = settingsActivity.Y;
                        if (button4 == null) {
                            jc.i.i("btnSpanish");
                            throw null;
                        }
                        button4.setEnabled(false);
                        rc.b0.q(androidx.lifecycle.i0.e(settingsActivity), null, new a2.g(str6, settingsActivity, dVar2, i19), 3);
                        return;
                    default:
                        int i115 = SettingsActivity.f1300e0;
                        String strC2 = g.l.b().c();
                        jc.i.d(strC2, "toLanguageTags(...)");
                        Log.d("SettingsLang", "btnEnglish presionado | tags='" + strC2 + '\'');
                        String str7 = "en";
                        if (pc.g.f0(strC2, "en", false)) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.language_already_selected), 0).show();
                            return;
                        }
                        Button button5 = settingsActivity.Z;
                        if (button5 == null) {
                            jc.i.i("btnEnglish");
                            throw null;
                        }
                        button5.setEnabled(false);
                        rc.b0.q(androidx.lifecycle.i0.e(settingsActivity), null, new a2.g(str7, settingsActivity, dVar2, i19), 3);
                        return;
                }
            }
        });
        x();
        C();
        ((Button) findViewById(R.id.btnSubscribe)).setOnClickListener(new View.OnClickListener(this) { // from class: h3.k2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f4753b;

            {
                this.f4753b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i18 = i16;
                int i19 = 13;
                yb.d dVar2 = null;
                boolean z11 = false;
                SettingsActivity settingsActivity = this.f4753b;
                switch (i18) {
                    case 0:
                        int i110 = SettingsActivity.f1300e0;
                        settingsActivity.startActivity(new Intent(settingsActivity, (Class<?>) NotificationHistoryActivity.class));
                        return;
                    case 1:
                        o3.k kVar = settingsActivity.N;
                        if (kVar == null) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.error_billing_connection), 0).show();
                            settingsActivity.x();
                            return;
                        }
                        o3.j jVarV = SettingsActivity.v(kVar);
                        String str5 = jVarV != null ? jVarV.f7504a : null;
                        if (str5 == null || str5.length() == 0) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.error_no_valid_offer), 0).show();
                            return;
                        }
                        h6.o0 o0Var = new h6.o0(18, z11);
                        o0Var.o(kVar);
                        if (TextUtils.isEmpty(str5)) {
                            throw new IllegalArgumentException("offerToken can not be empty");
                        }
                        o0Var.f5062c = str5;
                        o3.d dVarC = o0Var.c();
                        h6.o0 o0VarE = com.bumptech.glide.manager.q.e();
                        o0VarE.f5061b = new ArrayList(jd.d.D(dVarC));
                        com.bumptech.glide.manager.q qVarB = o0VarE.b();
                        o3.b bVar = settingsActivity.M;
                        if (bVar != null) {
                            bVar.w(settingsActivity, qVarB);
                            return;
                        } else {
                            jc.i.i("billingClient");
                            throw null;
                        }
                    case 2:
                        int i111 = SettingsActivity.f1300e0;
                        settingsActivity.finish();
                        return;
                    case 3:
                        int i112 = SettingsActivity.f1300e0;
                        settingsActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?package=" + settingsActivity.getPackageName())));
                        return;
                    case 4:
                        FirebaseAuth firebaseAuth2 = settingsActivity.K;
                        if (firebaseAuth2 == null) {
                            jc.i.i("auth");
                            throw null;
                        }
                        firebaseAuth2.d();
                        d7.a aVar = settingsActivity.L;
                        if (aVar == null) {
                            jc.i.i("googleSignInClient");
                            throw null;
                        }
                        aVar.signOut();
                        SettingsActivity.u();
                        Toast.makeText(settingsActivity, settingsActivity.getString(R.string.sign_out_success), 0).show();
                        settingsActivity.finish();
                        return;
                    case 5:
                        int i113 = SettingsActivity.f1300e0;
                        ArrayList arrayListQ = vb.j.Q(new h6.o0(29).d());
                        r4.d dVar3 = new r4.d(r4.e.a(n9.g.d()));
                        dVar3.b(arrayListQ);
                        dVar3.f8150d = false;
                        dVar3.e = false;
                        settingsActivity.f1302b0.a(dVar3.a());
                        return;
                    case 6:
                        int i114 = SettingsActivity.f1300e0;
                        String strC = g.l.b().c();
                        jc.i.d(strC, "toLanguageTags(...)");
                        Log.d("SettingsLang", "btnSpanish presionado | tags='" + strC + '\'');
                        String str6 = "es";
                        if (pc.g.f0(strC, "es", false)) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.language_already_selected), 0).show();
                            return;
                        }
                        Button button4 = settingsActivity.Y;
                        if (button4 == null) {
                            jc.i.i("btnSpanish");
                            throw null;
                        }
                        button4.setEnabled(false);
                        rc.b0.q(androidx.lifecycle.i0.e(settingsActivity), null, new a2.g(str6, settingsActivity, dVar2, i19), 3);
                        return;
                    default:
                        int i115 = SettingsActivity.f1300e0;
                        String strC2 = g.l.b().c();
                        jc.i.d(strC2, "toLanguageTags(...)");
                        Log.d("SettingsLang", "btnEnglish presionado | tags='" + strC2 + '\'');
                        String str7 = "en";
                        if (pc.g.f0(strC2, "en", false)) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.language_already_selected), 0).show();
                            return;
                        }
                        Button button5 = settingsActivity.Z;
                        if (button5 == null) {
                            jc.i.i("btnEnglish");
                            throw null;
                        }
                        button5.setEnabled(false);
                        rc.b0.q(androidx.lifecycle.i0.e(settingsActivity), null, new a2.g(str7, settingsActivity, dVar2, i19), 3);
                        return;
                }
            }
        });
        ((Button) findViewById(R.id.btnManageSubscription)).setOnClickListener(new View.OnClickListener(this) { // from class: h3.k2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f4753b;

            {
                this.f4753b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i18 = i17;
                int i19 = 13;
                yb.d dVar2 = null;
                boolean z11 = false;
                SettingsActivity settingsActivity = this.f4753b;
                switch (i18) {
                    case 0:
                        int i110 = SettingsActivity.f1300e0;
                        settingsActivity.startActivity(new Intent(settingsActivity, (Class<?>) NotificationHistoryActivity.class));
                        return;
                    case 1:
                        o3.k kVar = settingsActivity.N;
                        if (kVar == null) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.error_billing_connection), 0).show();
                            settingsActivity.x();
                            return;
                        }
                        o3.j jVarV = SettingsActivity.v(kVar);
                        String str5 = jVarV != null ? jVarV.f7504a : null;
                        if (str5 == null || str5.length() == 0) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.error_no_valid_offer), 0).show();
                            return;
                        }
                        h6.o0 o0Var = new h6.o0(18, z11);
                        o0Var.o(kVar);
                        if (TextUtils.isEmpty(str5)) {
                            throw new IllegalArgumentException("offerToken can not be empty");
                        }
                        o0Var.f5062c = str5;
                        o3.d dVarC = o0Var.c();
                        h6.o0 o0VarE = com.bumptech.glide.manager.q.e();
                        o0VarE.f5061b = new ArrayList(jd.d.D(dVarC));
                        com.bumptech.glide.manager.q qVarB = o0VarE.b();
                        o3.b bVar = settingsActivity.M;
                        if (bVar != null) {
                            bVar.w(settingsActivity, qVarB);
                            return;
                        } else {
                            jc.i.i("billingClient");
                            throw null;
                        }
                    case 2:
                        int i111 = SettingsActivity.f1300e0;
                        settingsActivity.finish();
                        return;
                    case 3:
                        int i112 = SettingsActivity.f1300e0;
                        settingsActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?package=" + settingsActivity.getPackageName())));
                        return;
                    case 4:
                        FirebaseAuth firebaseAuth2 = settingsActivity.K;
                        if (firebaseAuth2 == null) {
                            jc.i.i("auth");
                            throw null;
                        }
                        firebaseAuth2.d();
                        d7.a aVar = settingsActivity.L;
                        if (aVar == null) {
                            jc.i.i("googleSignInClient");
                            throw null;
                        }
                        aVar.signOut();
                        SettingsActivity.u();
                        Toast.makeText(settingsActivity, settingsActivity.getString(R.string.sign_out_success), 0).show();
                        settingsActivity.finish();
                        return;
                    case 5:
                        int i113 = SettingsActivity.f1300e0;
                        ArrayList arrayListQ = vb.j.Q(new h6.o0(29).d());
                        r4.d dVar3 = new r4.d(r4.e.a(n9.g.d()));
                        dVar3.b(arrayListQ);
                        dVar3.f8150d = false;
                        dVar3.e = false;
                        settingsActivity.f1302b0.a(dVar3.a());
                        return;
                    case 6:
                        int i114 = SettingsActivity.f1300e0;
                        String strC = g.l.b().c();
                        jc.i.d(strC, "toLanguageTags(...)");
                        Log.d("SettingsLang", "btnSpanish presionado | tags='" + strC + '\'');
                        String str6 = "es";
                        if (pc.g.f0(strC, "es", false)) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.language_already_selected), 0).show();
                            return;
                        }
                        Button button4 = settingsActivity.Y;
                        if (button4 == null) {
                            jc.i.i("btnSpanish");
                            throw null;
                        }
                        button4.setEnabled(false);
                        rc.b0.q(androidx.lifecycle.i0.e(settingsActivity), null, new a2.g(str6, settingsActivity, dVar2, i19), 3);
                        return;
                    default:
                        int i115 = SettingsActivity.f1300e0;
                        String strC2 = g.l.b().c();
                        jc.i.d(strC2, "toLanguageTags(...)");
                        Log.d("SettingsLang", "btnEnglish presionado | tags='" + strC2 + '\'');
                        String str7 = "en";
                        if (pc.g.f0(strC2, "en", false)) {
                            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.language_already_selected), 0).show();
                            return;
                        }
                        Button button5 = settingsActivity.Z;
                        if (button5 == null) {
                            jc.i.i("btnEnglish");
                            throw null;
                        }
                        button5.setEnabled(false);
                        rc.b0.q(androidx.lifecycle.i0.e(settingsActivity), null, new a2.g(str7, settingsActivity, dVar2, i19), 3);
                        return;
                }
            }
        });
    }

    @Override // g.g, androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        b bVar = this.M;
        if (bVar != null) {
            bVar.v();
        }
    }

    @Override // androidx.fragment.app.w, android.app.Activity
    public final void onResume() {
        super.onResume();
        C();
        w();
    }

    public final void w() {
        FirebaseAuth firebaseAuth = this.K;
        yb.d dVar = null;
        if (firebaseAuth == null) {
            jc.i.i("auth");
            throw null;
        }
        n nVar = firebaseAuth.f2702f;
        if (nVar == null) {
            return;
        }
        b0.q(androidx.lifecycle.i0.e(this), null, new a2.e(nVar, this, dVar, 5), 3);
    }

    public final void x() {
        androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(this);
        fVar.f764c = new j2(this);
        fVar.f762a = new wa.d();
        b bVarA = fVar.a();
        this.M = bVarA;
        bVarA.z(new a5.b(this, 16));
    }

    public final void y() {
        ea.j jVar = new ea.j((Context) this, R.style.KryptProxyDialog);
        jVar.l(R.string.embed_warn_title);
        jVar.f(R.string.embed_warn_msg);
        jVar.i(R.string.swipe_warn_ok, new o2(this, 1));
        jVar.j(R.string.embed_warn_lock, new o2(this, 2));
        jVar.g(R.string.cancel, null);
        ((g.b) jVar.f3530b).f3978n = new m2(this, 2);
        jVar.m();
    }

    public final void z(final boolean z4, final boolean z10) {
        ea.j jVar = new ea.j((Context) this, R.style.KryptProxyDialog);
        jVar.l(R.string.mode_change_title);
        String string = getString(R.string.mode_change_msg, Integer.valueOf(t()));
        g.b bVar = (g.b) jVar.f3530b;
        bVar.f3972f = string;
        jVar.j(R.string.mode_change_ok, new DialogInterface.OnClickListener() { // from class: h3.l2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SettingsActivity.u();
                boolean z11 = z10;
                if (z11) {
                    SharedPreferences sharedPreferences = i3.p.f5195a;
                    if (sharedPreferences == null) {
                        throw new IllegalStateException("Prefs.init(context) no llamado");
                    }
                    sharedPreferences.edit().putBoolean("tabs_swipe_enabled", true).apply();
                }
                SharedPreferences sharedPreferences2 = i3.p.f5195a;
                if (sharedPreferences2 == null) {
                    throw new IllegalStateException("Prefs.init(context) no llamado");
                }
                SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
                boolean z12 = z4;
                editorEdit.putBoolean("viewer_embedded", z12).apply();
                SettingsActivity settingsActivity = this.f4763a;
                settingsActivity.B();
                if (z11 || !z12) {
                    return;
                }
                SharedPreferences sharedPreferences3 = i3.p.f5195a;
                if (sharedPreferences3 == null) {
                    throw new IllegalStateException("Prefs.init(context) no llamado");
                }
                if (sharedPreferences3.getBoolean("tabs_swipe_enabled", false)) {
                    settingsActivity.y();
                }
            }
        });
        jVar.g(R.string.cancel, null);
        bVar.f3978n = new m2(this, 0);
        jVar.m();
    }
}

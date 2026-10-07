package com.google.firebase.auth;

import a3.j;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.fragment.app.w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.p002firebaseauthapi.zzadv;
import com.google.android.gms.internal.p002firebaseauthapi.zzadz;
import com.google.android.gms.internal.p002firebaseauthapi.zzaee;
import com.google.android.gms.internal.p002firebaseauthapi.zzafn;
import com.google.android.gms.internal.p002firebaseauthapi.zzafx;
import com.google.android.gms.internal.p002firebaseauthapi.zzagx;
import com.google.android.gms.internal.p002firebaseauthapi.zzahb;
import com.google.android.gms.internal.p002firebaseauthapi.zzaic;
import com.google.android.gms.internal.p002firebaseauthapi.zzap;
import com.google.android.gms.internal.p002firebaseauthapi.zzzr;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.internal.GenericIdpActivity;
import fa.c1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import n9.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q5.d;
import v9.a0;
import v9.c;
import v9.f0;
import v9.g0;
import v9.h0;
import v9.j0;
import v9.k0;
import v9.l0;
import v9.m0;
import v9.n;
import v9.t;
import v9.u;
import v9.x;
import w9.a;
import w9.b0;
import w9.d0;
import w9.e;
import w9.e0;
import w9.i;
import w9.k;
import w9.m;
import w9.s;
import w9.v;
import w9.y;
import ya.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class FirebaseAuth implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f2698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f2699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f2700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f2701d;
    public final zzadv e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n f2702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y f2703g;
    public final Object h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f2704j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f2705k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public j f2706l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RecaptchaAction f2707m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RecaptchaAction f2708n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final RecaptchaAction f2709o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s5.j f2710p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s f2711q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v f2712r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f2713s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f2714t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public v f2715u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Executor f2716v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Executor f2717w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Executor f2718x;

    /* JADX WARN: Code duplicated, block: B:4:0x0088  */
    public FirebaseAuth(g gVar, b bVar, b bVar2, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, Executor executor3) {
        d0 d0VarH;
        zzadv zzadvVar = new zzadv(gVar, executor, scheduledExecutorService);
        gVar.a();
        s5.j jVar = new s5.j(gVar.f7359a, gVar.f(), 9);
        s sVar = s.f9856c;
        v vVar = v.f9862c;
        this.f2699b = new CopyOnWriteArrayList();
        this.f2700c = new CopyOnWriteArrayList();
        this.f2701d = new CopyOnWriteArrayList();
        this.h = new Object();
        this.f2704j = new Object();
        this.f2707m = RecaptchaAction.custom("getOobCode");
        this.f2708n = RecaptchaAction.custom("signInWithPassword");
        this.f2709o = RecaptchaAction.custom("signUpPassword");
        this.f2698a = gVar;
        this.e = zzadvVar;
        this.f2710p = jVar;
        this.f2703g = new y();
        i0.i(sVar);
        this.f2711q = sVar;
        this.f2712r = vVar;
        this.f2713s = bVar;
        this.f2714t = bVar2;
        this.f2716v = executor;
        this.f2717w = executor2;
        this.f2718x = executor3;
        String string = ((SharedPreferences) jVar.f8445b).getString("com.google.firebase.auth.FIREBASE_USER", null);
        if (TextUtils.isEmpty(string)) {
            d0VarH = null;
        } else {
            try {
                JSONObject jSONObject = new JSONObject(string);
                if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                    d0VarH = jVar.H(jSONObject);
                } else {
                    d0VarH = null;
                }
            } catch (Exception unused) {
            }
        }
        this.f2702f = d0VarH;
        if (d0VarH != null) {
            s5.j jVar2 = this.f2710p;
            jVar2.getClass();
            String string2 = ((SharedPreferences) jVar2.f8445b).getString(u3.b.b("com.google.firebase.auth.GET_TOKEN_RESPONSE.", d0VarH.f9820b.f9806a), null);
            zzahb zzahbVarZzd = string2 != null ? zzahb.zzd(string2) : null;
            if (zzahbVarZzd != null) {
                h(this, this.f2702f, zzahbVarZzd, false, false);
            }
        }
        w9.n nVar = this.f2711q.f9857a;
        nVar.getClass();
        g gVar2 = this.f2698a;
        gVar2.a();
        SharedPreferences sharedPreferences = gVar2.f7359a.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0);
        String string3 = sharedPreferences.getString("firebaseAppName", "");
        g gVar3 = this.f2698a;
        gVar3.a();
        if (gVar3.f7360b.equals(string3)) {
            if (!sharedPreferences.contains("verifyAssertionRequest")) {
                if (!sharedPreferences.contains("recaptchaToken")) {
                    if (sharedPreferences.contains("statusCode")) {
                        Status status = new Status(sharedPreferences.getInt("statusCode", 17062), sharedPreferences.getString("statusMessage", ""), null, null);
                        nVar.f9853c = sharedPreferences.getLong("timestamp", 0L);
                        w9.n.a(sharedPreferences);
                        nVar.f9851a = Tasks.forException(zzadz.zza(status));
                        return;
                    }
                    return;
                }
                String string4 = sharedPreferences.getString("recaptchaToken", "");
                String string5 = sharedPreferences.getString("operation", "");
                nVar.f9853c = sharedPreferences.getLong("timestamp", 0L);
                if (string5.hashCode() == -214796028 && string5.equals("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA")) {
                    nVar.f9852b = Tasks.forResult(string4);
                } else {
                    nVar.f9852b = null;
                }
                w9.n.a(sharedPreferences);
                return;
            }
            String string6 = sharedPreferences.getString("verifyAssertionRequest", "");
            zzaic zzaicVar = (zzaic) c1.q(string6 == null ? null : Base64.decode(string6, 10), zzaic.CREATOR);
            String string7 = sharedPreferences.getString("operation", "");
            String string8 = sharedPreferences.getString("tenantId", null);
            String string9 = sharedPreferences.getString("firebaseUserUid", "");
            nVar.f9853c = sharedPreferences.getLong("timestamp", 0L);
            if (string8 != null) {
                i0.e(string8);
                synchronized (this.f2704j) {
                    this.f2705k = string8;
                }
                zzaicVar.zzf(string8);
            }
            int iHashCode = string7.hashCode();
            if (iHashCode != -98509410) {
                if (iHashCode != 175006864) {
                    if (iHashCode == 1450464913 && string7.equals("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN")) {
                        nVar.f9851a = c(h0.i(zzaicVar));
                    } else {
                        nVar.f9851a = null;
                    }
                } else if (string7.equals("com.google.firebase.auth.internal.NONGMSCORE_LINK") && ((d0) this.f2702f).f9820b.f9806a.equals(string9)) {
                    n nVar2 = this.f2702f;
                    h0 h0VarI = h0.i(zzaicVar);
                    i0.i(nVar2);
                    nVar.f9851a = this.e.zzn(this.f2698a, nVar2, h0VarI.h(), new g0(this, 0));
                } else {
                    nVar.f9851a = null;
                }
            } else if (string7.equals("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE") && ((d0) this.f2702f).f9820b.f9806a.equals(string9)) {
                nVar.f9851a = k(this.f2702f, h0.i(zzaicVar));
            } else {
                nVar.f9851a = null;
            }
            w9.n.a(sharedPreferences);
        }
    }

    public static void f(FirebaseAuth firebaseAuth, n nVar) {
        if (nVar != null) {
            Log.d("FirebaseAuth", "Notifying auth state listeners about user ( " + ((d0) nVar).f9820b.f9806a + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        firebaseAuth.f2718x.execute(new l0(firebaseAuth));
    }

    public static void g(FirebaseAuth firebaseAuth, n nVar) {
        if (nVar != null) {
            Log.d("FirebaseAuth", "Notifying id token listeners about user ( " + ((d0) nVar).f9820b.f9806a + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        String strZze = nVar != null ? ((d0) nVar).f9819a.zze() : null;
        db.b bVar = new db.b();
        bVar.f3177a = strZze;
        firebaseAuth.f2718x.execute(new l0(firebaseAuth, bVar));
    }

    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) g.d().b(FirebaseAuth.class);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b6  */
    public static void h(FirebaseAuth firebaseAuth, n nVar, zzahb zzahbVar, boolean z4, boolean z10) {
        boolean z11;
        zzahb zzahbVar2;
        String string;
        ArrayList arrayList;
        ArrayList arrayList2;
        i0.i(nVar);
        i0.i(zzahbVar);
        n nVar2 = firebaseAuth.f2702f;
        boolean z12 = true;
        boolean z13 = nVar2 != null && ((d0) nVar).f9820b.f9806a.equals(((d0) nVar2).f9820b.f9806a);
        if (z13 || !z10) {
            n nVar3 = firebaseAuth.f2702f;
            if (nVar3 == null) {
                z11 = true;
            } else {
                boolean z14 = (z13 && ((d0) nVar3).f9819a.zze().equals(zzahbVar.zze())) ? false : true;
                z11 = true ^ z13;
                z12 = z14;
            }
            n nVar4 = firebaseAuth.f2702f;
            if (nVar4 != null) {
                d0 d0Var = (d0) nVar;
                if (d0Var.f9820b.f9806a.equals(((d0) nVar4).f9820b.f9806a)) {
                    firebaseAuth.f2702f.l(d0Var.e);
                    if (!nVar.j()) {
                        ((d0) firebaseAuth.f2702f).f9825s = Boolean.FALSE;
                    }
                    m mVar = d0Var.f9829w;
                    if (mVar != null) {
                        arrayList2 = new ArrayList();
                        Iterator it = mVar.f9848a.iterator();
                        while (it.hasNext()) {
                            arrayList2.add((x) it.next());
                        }
                        Iterator it2 = mVar.f9849b.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add((a0) it2.next());
                        }
                    } else {
                        arrayList2 = new ArrayList();
                    }
                    firebaseAuth.f2702f.m(arrayList2);
                } else {
                    firebaseAuth.f2702f = nVar;
                }
            } else {
                firebaseAuth.f2702f = nVar;
            }
            if (z4) {
                s5.j jVar = firebaseAuth.f2710p;
                n nVar5 = firebaseAuth.f2702f;
                j7.a aVar = (j7.a) jVar.f8446c;
                i0.i(nVar5);
                JSONObject jSONObject = new JSONObject();
                if (d0.class.isAssignableFrom(nVar5.getClass())) {
                    d0 d0Var2 = (d0) nVar5;
                    try {
                        jSONObject.put("cachedTokenState", d0Var2.f9819a.zzh());
                        g gVarE = g.e(d0Var2.f9821c);
                        gVarE.a();
                        jSONObject.put("applicationName", gVarE.f7360b);
                        jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
                        if (d0Var2.e != null) {
                            JSONArray jSONArray = new JSONArray();
                            List list = d0Var2.e;
                            int size = list.size();
                            if (list.size() > 30) {
                                aVar.f("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(list.size()));
                                size = 30;
                            }
                            boolean zEquals = false;
                            for (int i = 0; i < size; i++) {
                                b0 b0Var = (b0) list.get(i);
                                zEquals |= b0Var.f9807b.equals("firebase");
                                if (i == size - 1 && !zEquals) {
                                    break;
                                }
                                jSONArray.put(b0Var.g());
                            }
                            if (!zEquals) {
                                int i10 = size - 1;
                                while (true) {
                                    if (i10 >= list.size() || i10 < 0) {
                                        aVar.f("Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d", Integer.valueOf(list.size()), Integer.valueOf(size));
                                        if (list.size() >= 5) {
                                            break;
                                        }
                                        StringBuilder sb2 = new StringBuilder("Provider user info list:\n");
                                        Iterator it3 = list.iterator();
                                        while (it3.hasNext()) {
                                            sb2.append("Provider - " + ((b0) it3.next()).f9807b + "\n");
                                        }
                                        aVar.f(sb2.toString(), new Object[0]);
                                        break;
                                    }
                                    b0 b0Var2 = (b0) list.get(i10);
                                    if (b0Var2.f9807b.equals("firebase")) {
                                        jSONArray.put(b0Var2.g());
                                        break;
                                    } else {
                                        if (i10 == list.size() - 1) {
                                            jSONArray.put(b0Var2.g());
                                        }
                                        i10++;
                                    }
                                }
                            }
                            jSONObject.put("userInfos", jSONArray);
                        }
                        jSONObject.put("anonymous", d0Var2.j());
                        jSONObject.put("version", "2");
                        e0 e0Var = d0Var2.f9826t;
                        if (e0Var != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.put("lastSignInTimestamp", e0Var.f9834a);
                                jSONObject2.put("creationTimestamp", e0Var.f9835b);
                            } catch (JSONException unused) {
                            }
                            jSONObject.put("userMetadata", jSONObject2);
                        }
                        m mVar2 = d0Var2.f9829w;
                        if (mVar2 != null) {
                            arrayList = new ArrayList();
                            Iterator it4 = mVar2.f9848a.iterator();
                            while (it4.hasNext()) {
                                arrayList.add((x) it4.next());
                            }
                            Iterator it5 = mVar2.f9849b.iterator();
                            while (it5.hasNext()) {
                                arrayList.add((a0) it5.next());
                            }
                        } else {
                            arrayList = new ArrayList();
                        }
                        if (!arrayList.isEmpty()) {
                            JSONArray jSONArray2 = new JSONArray();
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                jSONArray2.put(((v9.s) arrayList.get(i11)).h());
                            }
                            jSONObject.put("userMultiFactorInfo", jSONArray2);
                        }
                        string = jSONObject.toString();
                    } catch (Exception e) {
                        Log.wtf(aVar.f5701a, aVar.d("Failed to turn object into JSON", new Object[0]), e);
                        throw new zzzr(e);
                    }
                } else {
                    string = null;
                }
                if (!TextUtils.isEmpty(string)) {
                    ((SharedPreferences) jVar.f8445b).edit().putString("com.google.firebase.auth.FIREBASE_USER", string).apply();
                }
            }
            if (z12) {
                n nVar6 = firebaseAuth.f2702f;
                if (nVar6 != null) {
                    zzahbVar2 = zzahbVar;
                    ((d0) nVar6).f9819a = zzahbVar2;
                } else {
                    zzahbVar2 = zzahbVar;
                }
                g(firebaseAuth, nVar6);
            } else {
                zzahbVar2 = zzahbVar;
            }
            if (z11) {
                f(firebaseAuth, firebaseAuth.f2702f);
            }
            if (z4) {
                s5.j jVar2 = firebaseAuth.f2710p;
                jVar2.getClass();
                ((SharedPreferences) jVar2.f8445b).edit().putString(u3.b.b("com.google.firebase.auth.GET_TOKEN_RESPONSE.", ((d0) nVar).f9820b.f9806a), zzahbVar2.zzh()).apply();
            }
            n nVar7 = firebaseAuth.f2702f;
            if (nVar7 != null) {
                if (firebaseAuth.f2715u == null) {
                    g gVar = firebaseAuth.f2698a;
                    i0.i(gVar);
                    firebaseAuth.f2715u = new v(gVar);
                }
                v vVar = firebaseAuth.f2715u;
                zzahb zzahbVar3 = ((d0) nVar7).f9819a;
                vVar.getClass();
                if (zzahbVar3 == null) {
                    return;
                }
                long jZzb = zzahbVar3.zzb();
                if (jZzb <= 0) {
                    jZzb = 3600;
                }
                long jZzc = (jZzb * 1000) + zzahbVar3.zzc();
                e eVar = (e) vVar.f9864b;
                eVar.f9830a = jZzc;
                eVar.f9831b = -1L;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00f3  */
    public static void i(v1.b bVar) {
        Task taskForResult;
        w wVar = (w) bVar.f9121g;
        FirebaseAuth firebaseAuth = (FirebaseAuth) bVar.f9119d;
        String str = bVar.f9117b;
        i0.e(str);
        if (((u) bVar.h) == null && zzafn.zzd(str, (j0) bVar.f9120f, wVar, bVar.f9116a)) {
            return;
        }
        v vVar = firebaseAuth.f2712r;
        g gVar = firebaseAuth.f2698a;
        gVar.a();
        boolean zZza = zzaee.zza(gVar.f7359a);
        boolean z4 = bVar.f9118c;
        vVar.getClass();
        y yVar = firebaseAuth.f2703g;
        s sVar = s.f9856c;
        if (zzafx.zzg(gVar)) {
            taskForResult = Tasks.forResult(new w9.u(null, null));
        } else {
            yVar.getClass();
            Log.i("v", "ForceRecaptchaFlow from phoneAuthOptions = " + z4 + ", ForceRecaptchaFlow from firebaseSettings = false");
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            w9.n nVar = sVar.f9857a;
            nVar.getClass();
            Task task = System.currentTimeMillis() - nVar.f9853c < 3600000 ? nVar.f9852b : null;
            if (task == null) {
                if (zZza || z4) {
                    v.a(firebaseAuth, sVar, wVar, taskCompletionSource);
                } else {
                    gVar.a();
                    (!TextUtils.isEmpty((String) vVar.f9864b) ? Tasks.forResult(new zzagx((String) vVar.f9864b)) : firebaseAuth.e.zzl()).continueWithTask(firebaseAuth.f2717w, new w9.j(vVar, str, IntegrityManagerFactory.create(gVar.f7359a))).addOnCompleteListener(new bd.u(vVar, taskCompletionSource, firebaseAuth, sVar, wVar, 11));
                }
                taskForResult = taskCompletionSource.getTask();
            } else if (task.isSuccessful()) {
                taskForResult = Tasks.forResult(new w9.u((String) task.getResult(), null));
            } else {
                Log.e("v", "Error in previous reCAPTCHA flow: ".concat(String.valueOf(task.getException().getMessage())));
                Log.e("v", "Continuing with application verification as normal");
                if (zZza) {
                    v.a(firebaseAuth, sVar, wVar, taskCompletionSource);
                } else {
                    v.a(firebaseAuth, sVar, wVar, taskCompletionSource);
                }
                taskForResult = taskCompletionSource.getTask();
            }
        }
        d dVar = new d();
        dVar.f8041c = firebaseAuth;
        dVar.f8039a = bVar;
        dVar.f8040b = str;
        taskForResult.addOnCompleteListener(dVar);
    }

    public final String a() {
        String str;
        synchronized (this.f2704j) {
            str = this.f2705k;
        }
        return str;
    }

    public final Task b(String str, v9.b bVar) {
        i0.e(str);
        if (bVar == null) {
            bVar = new v9.b(new v9.a());
        }
        String str2 = this.i;
        if (str2 != null) {
            bVar.f9222s = str2;
        }
        bVar.f9223t = 1;
        return new k0(this, str, bVar, 0).s(this, this.f2705k, this.f2707m);
    }

    public final Task c(v9.d dVar) {
        c cVar;
        i0.i(dVar);
        v9.d dVarH = dVar.h();
        boolean z4 = dVarH instanceof v9.e;
        String str = this.f2705k;
        if (!z4) {
            boolean z10 = dVarH instanceof t;
            g gVar = this.f2698a;
            zzadv zzadvVar = this.e;
            return z10 ? zzadvVar.zzG(gVar, (t) dVarH, str, new f0(this)) : zzadvVar.zzC(gVar, dVarH, str, new f0(this));
        }
        v9.e eVar = (v9.e) dVarH;
        String str2 = eVar.f9237c;
        if (TextUtils.isEmpty(str2)) {
            String str3 = eVar.f9235a;
            String str4 = eVar.f9236b;
            i0.i(str4);
            String str5 = this.f2705k;
            return new m0(this, str3, false, null, str4, str5).s(this, str5, this.f2708n);
        }
        i0.e(str2);
        zzap zzapVar = c.f9227d;
        i0.e(str2);
        try {
            cVar = new c(str2);
        } catch (IllegalArgumentException unused) {
            cVar = null;
        }
        return (cVar == null || TextUtils.equals(str, cVar.f9230c)) ? new v9.e0(this, false, null, eVar).s(this, str, this.f2707m) : Tasks.forException(zzadz.zza(new Status(17072, null, null, null)));
    }

    public final void d() {
        s5.j jVar = this.f2710p;
        i0.i(jVar);
        SharedPreferences sharedPreferences = (SharedPreferences) jVar.f8445b;
        n nVar = this.f2702f;
        if (nVar != null) {
            sharedPreferences.edit().remove(u3.b.b("com.google.firebase.auth.GET_TOKEN_RESPONSE.", ((d0) nVar).f9820b.f9806a)).apply();
            this.f2702f = null;
        }
        sharedPreferences.edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
        g(this, null);
        f(this, null);
        v vVar = this.f2715u;
        if (vVar != null) {
            e eVar = (e) vVar.f9864b;
            eVar.f9832c.removeCallbacks(eVar.f9833d);
        }
    }

    public final Task e(u4.c cVar, ta.c cVar2) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ea.e eVar = this.f2711q.f9858b;
        if (eVar.f3515b) {
            return Tasks.forException(zzadz.zza(new Status(17057, null, null, null)));
        }
        eVar.g(cVar, new i(eVar, cVar, taskCompletionSource, this, null));
        eVar.f3515b = true;
        s.c(cVar.getApplicationContext(), this);
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
        intent.setClass(cVar, GenericIdpActivity.class);
        intent.setPackage(cVar.getPackageName());
        intent.putExtras((Bundle) cVar2.f8662a);
        cVar.startActivity(intent);
        return taskCompletionSource.getTask();
    }

    public final Task j(n nVar, boolean z4) {
        if (nVar == null) {
            return Tasks.forException(zzadz.zza(new Status(17495, null, null, null)));
        }
        zzahb zzahbVar = ((d0) nVar).f9819a;
        if (zzahbVar.zzj() && !z4) {
            return Tasks.forResult(k.a(zzahbVar.zze()));
        }
        return this.e.zzk(this.f2698a, nVar, zzahbVar.zzf(), new g0(this, 1));
    }

    public final Task k(n nVar, h0 h0Var) {
        c cVar;
        i0.i(nVar);
        v9.d dVarH = h0Var.h();
        if (!(dVarH instanceof v9.e)) {
            int i = 0;
            if (!(dVarH instanceof t)) {
                return this.e.zzp(this.f2698a, nVar, dVarH, nVar.i(), new g0(this, i));
            }
            return this.e.zzv(this.f2698a, nVar, (t) dVarH, this.f2705k, new g0(this, i));
        }
        v9.e eVar = (v9.e) dVarH;
        if ("password".equals(!TextUtils.isEmpty(eVar.f9236b) ? "password" : "emailLink")) {
            String str = eVar.f9235a;
            String str2 = eVar.f9236b;
            i0.e(str2);
            String strI = nVar.i();
            return new m0(this, str, true, nVar, str2, strI).s(this, strI, this.f2708n);
        }
        String str3 = eVar.f9237c;
        i0.e(str3);
        zzap zzapVar = c.f9227d;
        i0.e(str3);
        try {
            cVar = new c(str3);
        } catch (IllegalArgumentException unused) {
            cVar = null;
        }
        String str4 = this.f2705k;
        return (cVar == null || TextUtils.equals(str4, cVar.f9230c)) ? new v9.e0(this, true, nVar, eVar).s(this, str4, this.f2707m) : Tasks.forException(zzadz.zza(new Status(17072, null, null, null)));
    }

    public static FirebaseAuth getInstance(g gVar) {
        return (FirebaseAuth) gVar.b(FirebaseAuth.class);
    }
}

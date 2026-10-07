package e5;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.i0;
import androidx.webkit.ProxyConfig;
import app.namso_gen.spacehowen.MainActivity;
import bd.v;
import com.android.billingclient.api.Purchase;
import com.firebase.ui.auth.KickoffActivity;
import com.firebase.ui.auth.ui.email.EmailLinkCatcherActivity;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseCommonRegistrar;
import h3.e1;
import h3.r1;
import h3.u2;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import pc.o;
import q3.m;
import rc.b0;
import t4.n;
import vb.q;
import w9.a0;
import w9.d0;
import x9.s;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements OnCompleteListener, OnSuccessListener, Continuation, o3.a, m, x9.e, SuccessContinuation, t5.b, s5.g, OnFailureListener, ya.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3281c;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f3279a = i;
        this.f3280b = obj;
        this.f3281c = obj2;
    }

    private final Object c(Task task) {
        kb.h hVar = (kb.h) this.f3280b;
        Date date = (Date) this.f3281c;
        hVar.getClass();
        if (task.isSuccessful()) {
            kb.k kVar = hVar.f6174g;
            synchronized (kVar.f6184b) {
                kVar.f6183a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            }
            return task;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return task;
        }
        if (exception instanceof jb.e) {
            kb.k kVar2 = hVar.f6174g;
            synchronized (kVar2.f6184b) {
                kVar2.f6183a.edit().putInt("last_fetch_status", 2).apply();
            }
            return task;
        }
        kb.k kVar3 = hVar.f6174g;
        synchronized (kVar3.f6184b) {
            kVar3.f6183a.edit().putInt("last_fetch_status", 1).apply();
        }
        return task;
    }

    @Override // o3.a
    public void a(o3.e eVar) {
        MainActivity mainActivity = (MainActivity) this.f3280b;
        Purchase purchase = (Purchase) this.f3281c;
        int i = MainActivity.f1283j0;
        jc.i.e(eVar, "billingResult");
        if (eVar.f7495a == 0) {
            b0.q(i0.e(mainActivity), null, new r1(purchase, mainActivity, null, 1), 3);
        }
    }

    @Override // s5.g
    public Object apply(Object obj) {
        s5.i iVar = (s5.i) this.f3280b;
        l5.i iVar2 = (l5.i) this.f3281c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        s5.a aVar = iVar.f8442d;
        ArrayList arrayListO = iVar.o(sQLiteDatabase, iVar2, aVar.f8427b);
        for (i5.c cVar : i5.c.values()) {
            if (cVar != iVar2.f6824c) {
                int size = aVar.f8427b - arrayListO.size();
                if (size <= 0) {
                    break;
                }
                arrayListO.addAll(iVar.o(sQLiteDatabase, iVar2.b(cVar), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayListO.size(); i++) {
            sb2.append(((s5.b) arrayListO.get(i)).f8430a);
            if (i < arrayListO.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j4 = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j4));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j4), hashSet);
                }
                hashSet.add(new s5.h(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListO.listIterator();
        while (listIterator.hasNext()) {
            s5.b bVar = (s5.b) listIterator.next();
            long j10 = bVar.f8430a;
            if (map.containsKey(Long.valueOf(j10))) {
                v vVarC = bVar.f8432c.c();
                for (s5.h hVar : (Set) map.get(Long.valueOf(j10))) {
                    vVarC.b(hVar.f8436a, hVar.f8437b);
                }
                listIterator.set(new s5.b(j10, bVar.f8431b, vVarC.e()));
            }
        }
        return arrayListO;
    }

    @Override // ya.a
    public void b(ya.b bVar) {
        ya.a aVar = (ya.a) this.f3280b;
        ya.a aVar2 = (ya.a) this.f3281c;
        aVar.b(bVar);
        aVar2.b(bVar);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    @Override // x9.e
    public Object d(s sVar) {
        String strValueOf;
        switch (this.f3279a) {
            case 13:
                String str = (String) this.f3281c;
                lb.m mVar = (lb.m) this.f3280b;
                Context context = (Context) sVar.a(Context.class);
                switch (mVar.f6928a) {
                    case 3:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo == null) {
                            strValueOf = "";
                        } else {
                            strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                        }
                        break;
                    case 4:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 == null) {
                            strValueOf = "";
                        } else {
                            strValueOf = String.valueOf(applicationInfo2.minSdkVersion);
                        }
                        break;
                    case 5:
                        int i = Build.VERSION.SDK_INT;
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            strValueOf = "tv";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            strValueOf = "watch";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            strValueOf = "auto";
                        } else if (i >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            strValueOf = "embedded";
                        } else {
                            strValueOf = "";
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName == null) {
                            strValueOf = "";
                        } else {
                            strValueOf = FirebaseCommonRegistrar.a(installerPackageName);
                        }
                        break;
                }
                return new ib.a(str, strValueOf);
            default:
                String str2 = (String) this.f3281c;
                x9.b bVar = (x9.b) this.f3280b;
                try {
                    Trace.beginSection(str2);
                    return bVar.f10319f.d(sVar);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // q3.m
    public void e(Object obj) {
        u2 u2Var = (u2) this.f3280b;
        h3.c cVar = (h3.c) this.f3281c;
        String strOptString = ((JSONObject) obj).optString("short_url");
        if (strOptString == null) {
            strOptString = "";
        }
        if (!o.e0(strOptString, ProxyConfig.MATCH_HTTP, false)) {
            cVar.invoke(Boolean.FALSE);
            return;
        }
        ProgressBar progressBar = u2Var.f4859h0;
        if (progressBar == null) {
            jc.i.i("loader");
            throw null;
        }
        progressBar.setVisibility(8);
        Button button = u2Var.f4858g0;
        if (button == null) {
            jc.i.i("btnShorten");
            throw null;
        }
        button.setEnabled(true);
        EditText editText = u2Var.f4861j0;
        if (editText == null) {
            jc.i.i("resultUrl");
            throw null;
        }
        editText.setText(strOptString);
        TextView textView = u2Var.f4860i0;
        if (textView == null) {
            jc.i.i("resultTitle");
            throw null;
        }
        textView.setVisibility(0);
        EditText editText2 = u2Var.f4861j0;
        if (editText2 == null) {
            jc.i.i("resultUrl");
            throw null;
        }
        editText2.setVisibility(0);
        Button button2 = u2Var.k0;
        if (button2 == null) {
            jc.i.i("btnCopy");
            throw null;
        }
        button2.setVisibility(0);
        cVar.invoke(Boolean.TRUE);
    }

    @Override // t5.b
    public Object f() {
        switch (this.f3279a) {
            case 20:
                c3.j jVar = (c3.j) this.f3280b;
                Iterable iterable = (Iterable) this.f3281c;
                s5.i iVar = (s5.i) ((s5.d) jVar.f1761c);
                iVar.getClass();
                if (iterable.iterator().hasNext()) {
                    iVar.c().compileStatement("DELETE FROM events WHERE _id in " + s5.i.G(iterable)).execute();
                    break;
                }
                break;
            default:
                c3.j jVar2 = (c3.j) this.f3280b;
                for (Map.Entry entry : ((HashMap) this.f3281c).entrySet()) {
                    ((s5.i) ((s5.c) jVar2.i)).B(((Integer) entry.getValue()).intValue(), o5.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f3279a) {
            case 0:
                f fVar = (f) this.f3280b;
                String str = (String) this.f3281c;
                fVar.getClass();
                if (!task.isSuccessful()) {
                    fVar.f(s4.h.a(new r4.g(7)));
                } else if (TextUtils.isEmpty(str)) {
                    fVar.f(s4.h.a(new r4.g(9)));
                } else {
                    fVar.f(s4.h.a(new r4.g(10)));
                }
                break;
            case 3:
                h hVar = (h) this.f3280b;
                String str2 = (String) this.f3281c;
                hVar.getClass();
                hVar.f(task.isSuccessful() ? s4.h.c(str2) : s4.h.a(task.getException()));
                break;
            case 8:
                ((gb.g) this.f3280b).a((Intent) this.f3281c);
                break;
            case 10:
                jb.b bVar = (jb.b) this.f3280b;
                e1 e1Var = (e1) this.f3281c;
                jc.i.e(task, "task");
                if (task.isSuccessful()) {
                    String strC = bVar.c("premium_gates3");
                    ArrayList arrayList = new ArrayList();
                    try {
                        JSONArray jSONArray = new JSONArray(strC);
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            String string = jSONArray.getString(i);
                            jc.i.d(string, "getString(...)");
                            String string2 = pc.g.B0(string).toString();
                            if (string2.length() > 0) {
                                arrayList.add(string2);
                            }
                        }
                    } catch (Exception e) {
                        Log.e("RemoteConfig", "Error parseando premium_gates3: " + e.getMessage());
                    }
                    e1Var.D0 = arrayList;
                    Log.d("RemoteConfig", "Gates actualizados desde Firebase: " + e1Var.D0);
                } else {
                    e1Var.D0 = q.f9297a;
                    StringBuilder sb2 = new StringBuilder("Sin conexión con Firebase, gates apagados: ");
                    Exception exception = task.getException();
                    sb2.append(exception != null ? exception.getMessage() : null);
                    Log.w("RemoteConfig", sb2.toString());
                }
                break;
            default:
                w4.c cVar = (w4.c) this.f3280b;
                String str3 = (String) this.f3281c;
                cVar.getClass();
                if (task.isSuccessful()) {
                    cVar.f(s4.h.c(new s4.i((String) task.getResult(), str3, null, null, null)));
                } else {
                    cVar.f(s4.h.a(task.getException()));
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        n nVar = (n) this.f3280b;
        Credential credential = (Credential) this.f3281c;
        if ((exc instanceof v9.j) || (exc instanceof v9.i)) {
            com.google.android.gms.common.api.q qVarDelete = x6.b.f10300c.delete(n9.b.n(nVar.c()).asGoogleApiClient(), credential);
            wa.d dVar = new wa.d();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            qVarDelete.addStatusListener(new z(qVarDelete, taskCompletionSource, dVar));
            taskCompletionSource.getTask();
        }
        nVar.k();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i = this.f3279a;
        boolean z4 = true;
        Object obj2 = this.f3281c;
        Object obj3 = this.f3280b;
        switch (i) {
            case 1:
                f fVar = (f) obj3;
                a0 a0Var = (a0) obj;
                Application applicationC = fVar.c();
                ((a5.c) obj2).getClass();
                a5.c.a(applicationC);
                d0 d0Var = a0Var.f9802a;
                w9.b0 b0Var = d0Var.f9820b;
                fVar.h(new fd.e(new s4.i("emailLink", b0Var.f9810f, null, b0Var.f9808c, d0Var.h())).c(), a0Var);
                return;
            case 2:
                ((g) obj3).h((r4.i) obj2, (a0) obj);
                return;
            case 5:
                ((k) obj3).h((r4.i) obj2, (a0) obj);
                return;
            case 6:
                ((f5.d) obj3).g((v9.d) obj2);
                return;
            case 7:
                ((g5.a) obj3).h((r4.i) obj2, (a0) obj);
                return;
            case 19:
                KickoffActivity kickoffActivity = (KickoffActivity) obj3;
                if (((Bundle) obj2) != null) {
                    int i10 = KickoffActivity.P;
                    return;
                }
                n nVar = kickoffActivity.O;
                if (!TextUtils.isEmpty(((s4.c) nVar.f2923f).f8400s)) {
                    nVar.f(s4.h.a(new s4.d(u4.c.t(nVar.c(), EmailLinkCatcherActivity.class, (s4.c) nVar.f2923f), 106)));
                    return;
                }
                w9.n nVar2 = nVar.i.f2711q.f9857a;
                nVar2.getClass();
                Task task = System.currentTimeMillis() - nVar2.f9853c < 3600000 ? nVar2.f9851a : null;
                if (task != null) {
                    task.addOnSuccessListener(new t4.m(nVar)).addOnFailureListener(new t4.m(nVar));
                    return;
                }
                boolean z10 = com.bumptech.glide.d.p("password", ((s4.c) nVar.f2923f).f8395b) != null;
                ArrayList arrayList = new ArrayList();
                Iterator it = ((s4.c) nVar.f2923f).f8395b.iterator();
                while (it.hasNext()) {
                    String str = ((r4.c) it.next()).f8145a;
                    if (str.equals("google.com")) {
                        arrayList.add(com.bumptech.glide.d.z(str));
                    }
                }
                if (!z10 && arrayList.size() <= 0) {
                    z4 = false;
                }
                if (!((s4.c) nVar.f2923f).f8402u || !z4) {
                    nVar.k();
                    return;
                }
                nVar.f(s4.h.b());
                d7.a aVarN = n9.b.n(nVar.c());
                String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                if (strArr == null) {
                    strArr = new String[0];
                }
                String[] strArr2 = strArr;
                if (!z10 && strArr2.length == 0) {
                    throw new IllegalStateException("At least one authentication method must be specified");
                }
                com.google.android.gms.common.api.q qVarRequest = x6.b.f10300c.request(aVarN.asGoogleApiClient(), new z6.a(4, z10, strArr2, null, null, false, null, null, false));
                t tVar = new t(new z6.b());
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                qVarRequest.addStatusListener(new z(qVarRequest, taskCompletionSource, tVar));
                taskCompletionSource.getTask().addOnCompleteListener(new t4.m(nVar));
                return;
            case 23:
                a0 a0Var2 = (a0) obj;
                ((t4.g) obj3).j(((ta.c) obj2).h(), a0Var2.f9802a, a0Var2.f9804c, true);
                return;
            default:
                ((n) obj3).h((r4.i) obj2, (a0) obj);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        kb.c cVar = (kb.c) this.f3280b;
        kb.e eVar = (kb.e) this.f3281c;
        synchronized (cVar) {
            cVar.f6150c = Tasks.forResult(eVar);
        }
        return Tasks.forResult(eVar);
    }

    public /* synthetic */ c(String str, Object obj, int i) {
        this.f3279a = i;
        this.f3281c = str;
        this.f3280b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x008e  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [kb.m] */
    /* JADX WARN: Type inference failed for: r12v12, types: [com.google.android.gms.tasks.Task] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r12v28, types: [java.net.HttpURLConnection] */
    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws Throwable {
        Integer num;
        Throwable th;
        Integer numValueOf;
        switch (this.f3279a) {
            case 4:
                v9.d dVar = (v9.d) this.f3280b;
                r4.i iVar = (r4.i) this.f3281c;
                a0 a0Var = (a0) task.getResult(Exception.class);
                if (dVar == null) {
                    return Tasks.forResult(a0Var);
                }
                return a0Var.f9802a.k(dVar).continueWithTask(new q3.e(iVar)).addOnFailureListener(new a5.g("WBPasswordHandler", "linkWithCredential+merge failed."));
            case 9:
                gb.j jVar = (gb.j) this.f3280b;
                String str = (String) this.f3281c;
                synchronized (jVar) {
                    ((r.e) jVar.f4473b).remove(str);
                    break;
                }
                return task;
            case 15:
                return ((kb.h) this.f3280b).b(task, 0L, (HashMap) this.f3281c);
            case 16:
                c(task);
                return task;
            default:
                ?? r10 = (kb.m) this.f3280b;
                ?? r12 = (Task) this.f3281c;
                boolean z4 = true;
                try {
                    try {
                        try {
                            if (r12.isSuccessful()) {
                                try {
                                    synchronized (r10) {
                                        r10.f6191b = true;
                                    }
                                    r12 = (HttpURLConnection) r12.getResult();
                                    try {
                                        int responseCode = r12.getResponseCode();
                                        numValueOf = Integer.valueOf(responseCode);
                                        if (responseCode == 200) {
                                            try {
                                                synchronized (r10) {
                                                    r10.f6192c = 8;
                                                }
                                                r10.f6201o.d(0, kb.k.f6182f);
                                                r10.j(r12).d();
                                            } catch (IOException e) {
                                                e = e;
                                                Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                                                kb.m.b(r12);
                                                synchronized (r10) {
                                                    r10.f6191b = false;
                                                    if (numValueOf != null) {
                                                        z4 = false;
                                                    }
                                                    if (z4) {
                                                        r10.f6200n.getClass();
                                                        r10.k(new Date(System.currentTimeMillis()));
                                                    }
                                                    if (!z4) {
                                                    }
                                                    r10.h();
                                                    return Tasks.forResult(null);
                                                }
                                            }
                                        }
                                        kb.m.b(r12);
                                        synchronized (r10) {
                                            r10.f6191b = false;
                                        }
                                        boolean zD = kb.m.d(responseCode);
                                        if (zD) {
                                            r10.f6200n.getClass();
                                            r10.k(new Date(System.currentTimeMillis()));
                                        }
                                        if (!zD && responseCode != 200) {
                                            String strF = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                                            if (responseCode == 403) {
                                                strF = kb.m.f(r12.getErrorStream());
                                            }
                                            new jb.f(responseCode, strF, 0);
                                            r10.g();
                                        } else {
                                            r10.h();
                                        }
                                    } catch (IOException e4) {
                                        e = e4;
                                        numValueOf = null;
                                    } catch (Throwable th2) {
                                        num = null;
                                        th = th2;
                                        kb.m.b(r12);
                                        synchronized (r10) {
                                            r10.f6191b = false;
                                        }
                                        if (num != null && !kb.m.d(num.intValue())) {
                                            z4 = false;
                                        }
                                        if (z4) {
                                            r10.f6200n.getClass();
                                            r10.k(new Date(System.currentTimeMillis()));
                                        }
                                        if (!z4 && num.intValue() != 200) {
                                            String strF2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                                            if (num.intValue() == 403) {
                                                strF2 = kb.m.f(r12.getErrorStream());
                                            }
                                            new jb.f(num.intValue(), strF2, 0);
                                            r10.g();
                                        } else {
                                            r10.h();
                                        }
                                        throw th;
                                    }
                                } catch (IOException e10) {
                                    e = e10;
                                    r12 = 0;
                                    numValueOf = null;
                                    Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                                    kb.m.b(r12);
                                    synchronized (r10) {
                                        r10.f6191b = false;
                                    }
                                    if (numValueOf != null && !kb.m.d(numValueOf.intValue())) {
                                        z4 = false;
                                    }
                                    if (z4) {
                                        r10.f6200n.getClass();
                                        r10.k(new Date(System.currentTimeMillis()));
                                    }
                                    if (!z4 || numValueOf.intValue() == 200) {
                                        r10.h();
                                    } else {
                                        String strF3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                                        if (numValueOf.intValue() == 403) {
                                            strF3 = kb.m.f(r12.getErrorStream());
                                        }
                                        new jb.f(numValueOf.intValue(), strF3, 0);
                                        r10.g();
                                    }
                                    return Tasks.forResult(null);
                                }
                                return Tasks.forResult(null);
                            }
                            throw new IOException(r12.getException());
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (IOException e11) {
                        e = e11;
                    }
                } catch (Throwable th4) {
                    num = null;
                    th = th4;
                    r12 = 0;
                }
                break;
        }
    }
}

package a3;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Base64;
import android.util.JsonWriter;
import android.util.Log;
import androidx.emoji2.text.p;
import androidx.emoji2.text.t;
import androidx.viewpager2.widget.ViewPager2;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.internal.p002firebaseauthapi.zzac;
import com.google.android.gms.internal.p002firebaseauthapi.zzadz;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import gb.r;
import h6.o0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q0.v0;
import w9.v;
import z7.a1;
import z7.i0;
import z7.q0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements i6.f, Continuation {
    public static j e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f110d;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f107a = obj;
        this.f108b = obj2;
        this.f109c = obj3;
        this.f110d = obj4;
    }

    public static synchronized j c(Context context, f3.a aVar) {
        try {
            if (e == null) {
                j jVar = new j();
                Context applicationContext = context.getApplicationContext();
                jVar.f107a = new a(applicationContext, aVar);
                jVar.f108b = new b(applicationContext, aVar);
                jVar.f109c = new h(applicationContext, aVar);
                jVar.f110d = new i(applicationContext, aVar);
                e = jVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:32:0x006b A[Catch: all -> 0x009d, TryCatch #3 {all -> 0x009d, blocks: (B:30:0x0065, B:32:0x006b, B:35:0x00a0), top: B:60:0x0065 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x006b, please report this as an issue */
    public void a(fd.i iVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f110d;
        synchronized (this) {
            if (!arrayDeque.remove(iVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        byte[] bArr = cd.b.f1822a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f108b).iterator();
                jc.i.d(it, "readyAsyncCalls.iterator()");
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    if (((ArrayDeque) this.f109c).size() < 64) {
                        throw null;
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.f109c).size();
                    ((ArrayDeque) this.f110d).size();
                }
                if (arrayList.size() > 0) {
                    if (arrayList.get(0) == null) {
                        throw new ClassCastException();
                    }
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.f107a) == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String str = cd.b.f1827g + " Dispatcher";
                                jc.i.e(str, "name");
                                this.f107a = new ThreadPoolExecutor(0, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 60L, timeUnit, synchronousQueue, new cd.a(str, false));
                            }
                            jc.i.b((ThreadPoolExecutor) this.f107a);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayList.size() > 0) {
            if (arrayList.get(0) == null) {
                throw new ClassCastException();
            }
            synchronized (this) {
                if (((ThreadPoolExecutor) this.f107a) == null) {
                    TimeUnit timeUnit2 = TimeUnit.SECONDS;
                    SynchronousQueue synchronousQueue2 = new SynchronousQueue();
                    String str2 = cd.b.f1827g + " Dispatcher";
                    jc.i.e(str2, "name");
                    this.f107a = new ThreadPoolExecutor(0, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 60L, timeUnit2, synchronousQueue2, new cd.a(str2, false));
                }
                jc.i.b((ThreadPoolExecutor) this.f107a);
                throw null;
            }
        }
    }

    @Override // i6.f
    public void b(JsonWriter jsonWriter) throws IOException {
        String str = (String) this.f107a;
        String str2 = (String) this.f108b;
        Map map = (Map) this.f109c;
        byte[] bArr = (byte[]) this.f110d;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        i6.g.e(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64.encodeToString(bArr, 0));
        }
        jsonWriter.endObject();
    }

    public Task d(Callable callable) {
        Task taskContinueWith;
        synchronized (this.f109c) {
            taskContinueWith = ((Task) this.f108b).continueWith((Executor) this.f107a, new e7.i(callable, 14));
            this.f108b = taskContinueWith.continueWith((Executor) this.f107a, new wa.d());
        }
        return taskContinueWith;
    }

    public Task e(Callable callable) {
        Task taskContinueWithTask;
        synchronized (this.f109c) {
            taskContinueWithTask = ((Task) this.f108b).continueWithTask((Executor) this.f107a, new e7.i(callable, 14));
            this.f108b = taskContinueWithTask.continueWith((Executor) this.f107a, new wa.d());
        }
        return taskContinueWithTask;
    }

    public void f() {
        int iA;
        a5.b bVar = (a5.b) this.f108b;
        q3.e eVar = (q3.e) this.f107a;
        ViewPager2 viewPager2 = (ViewPager2) this.f110d;
        int i = R.id.accessibilityActionPageLeft;
        v0.i(viewPager2, R.id.accessibilityActionPageLeft);
        v0.g(viewPager2, 0);
        v0.i(viewPager2, R.id.accessibilityActionPageRight);
        v0.g(viewPager2, 0);
        v0.i(viewPager2, R.id.accessibilityActionPageUp);
        v0.g(viewPager2, 0);
        v0.i(viewPager2, R.id.accessibilityActionPageDown);
        v0.g(viewPager2, 0);
        if (viewPager2.getAdapter() == null || (iA = viewPager2.getAdapter().a()) == 0 || !viewPager2.C) {
            return;
        }
        if (viewPager2.getOrientation() != 0) {
            if (viewPager2.f1211d < iA - 1) {
                v0.j(viewPager2, new r0.f(R.id.accessibilityActionPageDown), eVar);
            }
            if (viewPager2.f1211d > 0) {
                v0.j(viewPager2, new r0.f(R.id.accessibilityActionPageUp), bVar);
                return;
            }
            return;
        }
        boolean z4 = viewPager2.f1213r.A() == 1;
        int i10 = z4 ? 16908360 : 16908361;
        if (z4) {
            i = 16908361;
        }
        if (viewPager2.f1211d < iA - 1) {
            v0.j(viewPager2, new r0.f(i10), eVar);
        }
        if (viewPager2.f1211d > 0) {
            v0.j(viewPager2, new r0.f(i), bVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0087 A[Catch: NumberFormatException | JSONException -> 0x0098, NumberFormatException | JSONException -> 0x0098, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x0098, blocks: (B:10:0x002c, B:20:0x0057, B:20:0x0057, B:29:0x0087, B:29:0x0087, B:24:0x0067, B:24:0x0067, B:28:0x007b, B:28:0x007b), top: B:41:0x002c, outer: #1 }] */
    public Bundle g() {
        q0 q0Var = (q0) this.f110d;
        if (((Bundle) this.f109c) == null) {
            String string = q0Var.g().getString((String) this.f107a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode == 115 && string3.equals("s")) {
                                        bundle.putString(string2, jSONObject.getString("v"));
                                    } else {
                                        i0 i0Var = ((a1) q0Var.f159a).f11007t;
                                        a1.f(i0Var);
                                        i0Var.f11190f.c(string3, "Unrecognized persisted bundle type. Type");
                                    }
                                } else if (string3.equals("l")) {
                                    bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                } else {
                                    i0 i0Var2 = ((a1) q0Var.f159a).f11007t;
                                    a1.f(i0Var2);
                                    i0Var2.f11190f.c(string3, "Unrecognized persisted bundle type. Type");
                                }
                            } else if (string3.equals("d")) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else {
                                i0 i0Var3 = ((a1) q0Var.f159a).f11007t;
                                a1.f(i0Var3);
                                i0Var3.f11190f.c(string3, "Unrecognized persisted bundle type. Type");
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            i0 i0Var4 = ((a1) q0Var.f159a).f11007t;
                            a1.f(i0Var4);
                            i0Var4.f11190f.b("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f109c = bundle;
                } catch (JSONException unused2) {
                    i0 i0Var5 = ((a1) q0Var.f159a).f11007t;
                    a1.f(i0Var5);
                    i0Var5.f11190f.b("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.f109c) == null) {
                this.f109c = (Bundle) this.f108b;
            }
        }
        return (Bundle) this.f109c;
    }

    public Task h(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        Task taskContinueWithTask;
        HashMap map = (HashMap) this.f107a;
        boolean zZzd = zzac.zzd(str);
        String str2 = ProxyConfig.MATCH_ALL_SCHEMES;
        if (zZzd) {
            str = ProxyConfig.MATCH_ALL_SCHEMES;
        }
        Task task = (Task) map.get(str);
        if (bool.booleanValue() || task == null) {
            if (!zzac.zzd(str)) {
                str2 = str;
            }
            if (bool.booleanValue() || (taskContinueWithTask = (Task) map.get(str2)) == null) {
                FirebaseAuth firebaseAuth = (FirebaseAuth) this.f110d;
                taskContinueWithTask = firebaseAuth.e.zzm(firebaseAuth.f2705k, "RECAPTCHA_ENTERPRISE").continueWithTask(new s5.j(this, str2, 8, false));
            }
            task = taskContinueWithTask;
        }
        return task.continueWithTask(new v(recaptchaAction, 3));
    }

    public void i(Bundle bundle) {
        String str = (String) this.f107a;
        q0 q0Var = (q0) this.f110d;
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor editorEdit = q0Var.g().edit();
        if (bundle.size() == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            i0 i0Var = ((a1) q0Var.f159a).f11007t;
                            a1.f(i0Var);
                            i0Var.f11190f.c(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e4) {
                        i0 i0Var2 = ((a1) q0Var.f159a).f11007t;
                        a1.f(i0Var2);
                        i0Var2.f11190f.c(e4, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f109c = bundle;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        j jVar;
        j jVar2;
        RecaptchaAction recaptchaAction = (RecaptchaAction) this.f107a;
        FirebaseAuth firebaseAuth = (FirebaseAuth) this.f108b;
        String str = (String) this.f109c;
        v vVar = (v) this.f110d;
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exception = task.getException();
        com.google.android.gms.common.internal.i0.i(exception);
        int i = zzadz.zzb;
        if (!(exception instanceof v9.h) || !((v9.h) exception).f9247a.endsWith("MISSING_RECAPTCHA_TOKEN")) {
            Log.e("RecaptchaCallWrapper", "Initial task failed for action " + String.valueOf(recaptchaAction) + "with exception - " + exception.getMessage());
            return Tasks.forException(exception);
        }
        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
            Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action ".concat(String.valueOf(recaptchaAction)));
        }
        synchronized (firebaseAuth) {
            jVar = firebaseAuth.f2706l;
        }
        if (jVar == null) {
            n9.g gVar = firebaseAuth.f2698a;
            j jVar3 = new j();
            jVar3.f107a = new HashMap();
            jVar3.f109c = gVar;
            jVar3.f110d = firebaseAuth;
            synchronized (firebaseAuth) {
                firebaseAuth.f2706l = jVar3;
            }
        }
        synchronized (firebaseAuth) {
            jVar2 = firebaseAuth.f2706l;
        }
        return jVar2.h(str, Boolean.FALSE, recaptchaAction).continueWithTask(vVar).continueWithTask(new r(str, jVar2, recaptchaAction, vVar));
    }

    public j(Throwable th, o0 o0Var) {
        this.f107a = th.getLocalizedMessage();
        this.f108b = th.getClass().getName();
        this.f109c = o0Var.j(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f110d = cause != null ? new j(cause, o0Var) : null;
    }

    public j(Typeface typeface, f1.b bVar) {
        int i;
        int i10;
        int i11;
        int i12;
        this.f110d = typeface;
        this.f107a = bVar;
        this.f109c = new t(1024);
        int iA = bVar.a(6);
        if (iA != 0) {
            int i13 = iA + bVar.f3575a;
            i = ((ByteBuffer) bVar.f3578d).getInt(((ByteBuffer) bVar.f3578d).getInt(i13) + i13);
        } else {
            i = 0;
        }
        this.f108b = new char[i * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i14 = iA2 + bVar.f3575a;
            i10 = ((ByteBuffer) bVar.f3578d).getInt(((ByteBuffer) bVar.f3578d).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        for (int i15 = 0; i15 < i10; i15++) {
            p pVar = new p(this, i15);
            f1.a aVarB = pVar.b();
            int iA3 = aVarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) aVarB.f3578d).getInt(iA3 + aVarB.f3575a) : 0, (char[]) this.f108b, i15 * 2);
            f1.a aVarB2 = pVar.b();
            int iA4 = aVarB2.a(16);
            if (iA4 != 0) {
                int i16 = iA4 + aVarB2.f3575a;
                i11 = ((ByteBuffer) aVarB2.f3578d).getInt(((ByteBuffer) aVarB2.f3578d).getInt(i16) + i16);
            } else {
                i11 = 0;
            }
            qd.b.e("invalid metadata codepoint length", i11 > 0);
            t tVar = (t) this.f109c;
            f1.a aVarB3 = pVar.b();
            int iA5 = aVarB3.a(16);
            if (iA5 != 0) {
                int i17 = iA5 + aVarB3.f3575a;
                i12 = ((ByteBuffer) aVarB3.f3578d).getInt(((ByteBuffer) aVarB3.f3578d).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            tVar.a(pVar, 0, i12 - 1);
        }
    }
}

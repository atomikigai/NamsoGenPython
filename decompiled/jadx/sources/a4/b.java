package a4;

import android.content.ClipDescription;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Base64;
import android.util.JsonWriter;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.w0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.play_billing.zzbt;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import l.i1;
import org.json.JSONObject;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class b implements y, a, j0, m0.e, g2.b, u3.g, i1, r0.x, i6.f, k8.a, SuccessContinuation, k.j, s0, androidx.activity.result.b, pb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f113b;

    public /* synthetic */ b(a5.b bVar) {
        this.f112a = 24;
        this.f113b = (zzbt) bVar.f188b;
    }

    @Override // i6.f
    public void b(JsonWriter jsonWriter) throws IOException {
        Object obj = i6.g.f5227b;
        jsonWriter.name("params").beginObject();
        byte[] bArr = (byte[]) this.f113b;
        int length = bArr.length;
        String strEncodeToString = Base64.encodeToString(bArr, 0);
        if (length < 10000) {
            jsonWriter.name("body").value(strEncodeToString);
        } else {
            String strA = i6.d.a(strEncodeToString, "MD5");
            if (strA != null) {
                jsonWriter.name("bodydigest").value(strA);
            }
        }
        jsonWriter.name("bodylength").value(length);
        jsonWriter.endObject();
    }

    @Override // r0.x
    public boolean c(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f113b;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = v0.f7946a;
        boolean z4 = q0.e0.d(view) == 1;
        int i = swipeDismissBehavior.e;
        view.offsetLeftAndRight((!(i == 0 && z4) && (i != 1 || z4)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        a5.b bVar = swipeDismissBehavior.f2335b;
        if (bVar != null) {
            bVar.x(view);
        }
        return true;
    }

    @Override // androidx.lifecycle.s0
    public p0 d(Class cls, l1.b bVar) {
        androidx.lifecycle.l0 l0Var = null;
        for (l1.c cVar : (l1.c[]) this.f113b) {
            if (cVar.f6510a.equals(cls)) {
                l0Var = new androidx.lifecycle.l0();
            }
        }
        if (l0Var != null) {
            return l0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override // androidx.activity.result.b
    public void e(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f113b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f387b;
        int i = zzc.zzh(intent, "ProxyBillingActivityV2").f7495a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.I;
        if (resultReceiver != null) {
            resultReceiver.send(i, intent == null ? null : intent.getExtras());
        }
        int i10 = aVar.f386a;
        if (i10 != -1 || i != 0) {
            zzc.zzn("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i10 + " and billing's responseCode: " + i);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // u3.g
    public void f(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (((ByteBuffer) this.f113b)) {
            ((ByteBuffer) this.f113b).position(0);
            messageDigest.update(((ByteBuffer) this.f113b).putInt(num.intValue()).array());
        }
    }

    @Override // k.j
    public boolean g(k.l lVar, MenuItem menuItem) {
        l.m mVar = ((ActionMenuView) this.f113b).K;
        if (mVar == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((ib.c) mVar).f5256b).R.f5062c).iterator();
        if (it.hasNext()) {
            throw q1.a.g(it);
        }
        return false;
    }

    @Override // g2.b
    public g2.a h(String str) {
        jc.i.e(str, "fileName");
        return new b2.a(((h2.e) this.f113b).z());
    }

    @Override // a4.y
    public x i(e0 e0Var) {
        switch (this.f112a) {
            case 0:
                return new c(0, (AssetManager) this.f113b, this);
            case 1:
                return new c((Resources) this.f113b, e0Var.a(Uri.class, AssetFileDescriptor.class));
            default:
                return new k0(this);
        }
    }

    @Override // k.j
    public void j(k.l lVar) {
        a5.b bVar = ((ActionMenuView) this.f113b).F;
        if (bVar != null) {
            bVar.j(lVar);
        }
    }

    public r0.l k(int i) {
        return null;
    }

    public r0.l l(int i) {
        return null;
    }

    public void m() {
        ((androidx.fragment.app.v) this.f113b).f999s.J();
    }

    @Override // a4.j0
    public com.bumptech.glide.load.data.e n(Uri uri) {
        return new com.bumptech.glide.load.data.n(1, uri, (ContentResolver) this.f113b);
    }

    @Override // a4.a
    public com.bumptech.glide.load.data.e o(AssetManager assetManager, String str) {
        return new com.bumptech.glide.load.data.k(assetManager, str, 1);
    }

    @Override // m0.e
    public void onCancel() {
        ((w0) this.f113b).a();
    }

    public boolean p(int i, int i10, Bundle bundle) {
        return false;
    }

    public synchronized void q(t3.c cVar) {
        cVar.f8576b = null;
        cVar.f8577c = null;
        ((ArrayDeque) this.f113b).offer(cVar);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) throws Throwable {
        JSONObject jSONObjectC;
        FileWriter fileWriter;
        c3.j jVar = (c3.j) this.f113b;
        da.a0 a0Var = (da.a0) jVar.f1763f;
        ka.d dVar = (ka.d) jVar.f1760b;
        String str = a0Var.f3089a;
        FileWriter fileWriter2 = null;
        try {
            HashMap mapB = da.a0.b(dVar);
            a2.l lVar = new a2.l(str, mapB);
            lVar.B("User-Agent", "Crashlytics Android SDK/18.4.3");
            lVar.B("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            da.a0.a(lVar, dVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + mapB;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObjectC = a0Var.c(lVar.k());
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e);
            jSONObjectC = null;
        }
        if (jSONObjectC != null) {
            ka.b bVarD = ((e7.i) jVar.f1761c).D(jSONObjectC);
            ib.c cVar = (ib.c) jVar.e;
            long j4 = bVarD.f6131c;
            cVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObjectC.put("expires_at", j4);
                fileWriter = new FileWriter((File) cVar.f5256b);
                try {
                    try {
                        fileWriter.write(jSONObjectC.toString());
                        fileWriter.flush();
                    } catch (Exception e4) {
                        e = e4;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                    }
                } catch (Throwable th) {
                    th = th;
                    fileWriter2 = fileWriter;
                    da.h.c(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
                fileWriter = null;
            } catch (Throwable th2) {
                th = th2;
                da.h.c(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            da.h.c(fileWriter, "Failed to close settings writer.");
            c3.j.n(jSONObjectC, "Loaded settings: ");
            String str4 = dVar.f6138f;
            SharedPreferences.Editor editorEdit = ((Context) jVar.f1759a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            editorEdit.putString("existing_instance_identifier", str4);
            editorEdit.apply();
            ((AtomicReference) jVar.h).set(bVarD);
            ((TaskCompletionSource) ((AtomicReference) jVar.i).get()).trySetResult(bVarD);
        }
        return Tasks.forResult(null);
    }

    public /* synthetic */ b(Object obj, int i) {
        this.f112a = i;
        this.f113b = obj;
    }

    public b(h2.e eVar) {
        this.f112a = 5;
        jc.i.e(eVar, "openHelper");
        this.f113b = eVar;
    }

    public b(int i) {
        this.f112a = i;
        switch (i) {
            case 7:
                this.f113b = ByteBuffer.allocate(4);
                break;
            case 8:
                break;
            case 14:
                char[] cArr = p4.n.f7811a;
                this.f113b = new ArrayDeque(0);
                break;
            case 27:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f113b = new r0.n(this);
                } else {
                    this.f113b = new r0.m(this);
                }
                break;
            default:
                jc.i.e(TimeUnit.MINUTES, "timeUnit");
                this.f113b = new fd.l(ed.d.i);
                break;
        }
    }

    public b(l1.c[] cVarArr) {
        this.f112a = 21;
        jc.i.e(cVarArr, "initializers");
        this.f113b = cVarArr;
    }

    public b(EditText editText) {
        this.f112a = 12;
        this.f113b = new aa.c(editText);
    }

    public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f112a = 29;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f113b = new t0.e(uri, clipDescription, uri2);
        } else {
            this.f113b = new q5.d(uri, clipDescription, uri2);
        }
    }
}

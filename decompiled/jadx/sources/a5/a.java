package a5;

import android.content.ClipData;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.widget.Toast;
import androidx.fragment.app.w;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewStartUpResult;
import app.namso_gen.spacehowen.MainActivity;
import app.namso_gen.spacehowen.R;
import bd.v;
import com.firebase.ui.auth.KickoffActivity;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.messaging.FirebaseMessaging;
import fa.c1;
import gb.a0;
import gb.c0;
import gb.x;
import h3.j0;
import h6.o0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import jc.i;
import k5.m;
import l3.t;
import lb.r;
import lb.s;
import o3.j;
import o3.k;
import q0.v0;
import q3.l;
import q3.n;
import s4.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Continuation, ya.a, WebViewCompat.WebViewStartUpCallback, OnFailureListener, r0.d, OnSuccessListener, OnCompleteListener, l, n8.g, SuccessContinuation, androidx.activity.result.b, o3.f, i5.d, o3.l, t5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f185b;

    public /* synthetic */ a(Object obj, int i) {
        this.f184a = i;
        this.f185b = obj;
    }

    @Override // o3.f
    public void a(o3.e eVar, String str) {
        o3.b bVar = (o3.b) this.f185b;
        i.e(eVar, "<unused var>");
        i.e(str, "<unused var>");
        bVar.v();
    }

    @Override // i5.d
    public Object apply(Object obj) {
        ((b) this.f185b).getClass();
        String strF = s.f6944a.f((r) obj);
        i.d(strF, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(strF));
        byte[] bytes = strF.getBytes(pc.a.f7846a);
        i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // ya.a
    public void b(ya.b bVar) {
        switch (this.f184a) {
            case 1:
                aa.b bVar2 = (aa.b) this.f185b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
                }
                bVar2.f261b.set((aa.b) bVar.get());
                return;
            case 22:
                AtomicReference atomicReference = (AtomicReference) ((ib.c) this.f185b).f5256b;
                if (bVar.get() != null) {
                    throw new ClassCastException();
                }
                atomicReference.set(null);
                return;
            default:
                ((AtomicReference) ((b) this.f185b).f188b).set((w9.a) bVar.get());
                return;
        }
    }

    @Override // q3.l
    public void c(n nVar) {
        switch (this.f184a) {
            case 12:
                j0 j0Var = (j0) this.f185b;
                Log.e("CheckerCache", "get_status.php error: " + nVar.getMessage());
                j0Var.b(Boolean.FALSE, null, null);
                break;
            default:
                ((h3.c) this.f185b).invoke(Boolean.FALSE);
                break;
        }
    }

    @Override // o3.l
    public void d(o3.e eVar, o0 o0Var) {
        k4.b bVar;
        ArrayList arrayList;
        m3.b bVar2 = (m3.b) this.f185b;
        i.e(eVar, "billingResult");
        List list = (List) o0Var.f5061b;
        if (eVar.f7495a == 0) {
            i.d(list, "getProductDetailsList(...)");
            if (list.isEmpty()) {
                return;
            }
            k kVar = (k) list.get(0);
            bVar2.f7050x0 = kVar;
            j jVarF0 = m3.b.f0(kVar);
            o3.i iVar = (jVarF0 == null || (bVar = jVarF0.f7505b) == null || (arrayList = bVar.f5977a) == null) ? null : (o3.i) vb.i.a0(arrayList);
            String str = iVar != null ? iVar.f7502a : null;
            w wVarP = bVar2.g();
            if (wVarP != null) {
                wVarP.runOnUiThread(new androidx.webkit.b(15, bVar2, str));
            }
        }
    }

    @Override // androidx.activity.result.b
    public void e(Object obj) {
        n3.b bVarE;
        t tVar = (t) this.f185b;
        s4.b bVar = (s4.b) obj;
        if (bVar.f8393b.intValue() != -1) {
            tVar.k0 = null;
            if (bVar.f8392a != null) {
                Toast.makeText(tVar.U(), R.string.error_sign_in, 0).show();
                return;
            }
            return;
        }
        if (FirebaseAuth.getInstance().f2702f != null) {
            w wVarP = tVar.g();
            MainActivity mainActivity = wVarP instanceof MainActivity ? (MainActivity) wVarP : null;
            if (mainActivity != null) {
                mainActivity.x();
            }
            Long l2 = tVar.k0;
            tVar.k0 = null;
            if (l2 == null || (bVarE = p3.a.e(l2.longValue())) == null) {
                return;
            }
            tVar.i0(bVarE);
        }
    }

    @Override // t5.b
    public Object f() {
        int i = this.f184a;
        int i10 = 0;
        Object obj = this.f185b;
        switch (i) {
            case 25:
                s5.i iVar = (s5.i) ((s5.c) obj);
                iVar.getClass();
                int i11 = o5.a.e;
                a3.j jVar = new a3.j();
                jVar.f107a = null;
                jVar.f108b = new ArrayList();
                jVar.f109c = null;
                jVar.f110d = "";
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseC = iVar.c();
                sQLiteDatabaseC.beginTransaction();
                try {
                    o5.a aVar = (o5.a) s5.i.H(sQLiteDatabaseC.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new e5.d(iVar, map, jVar, 11));
                    sQLiteDatabaseC.setTransactionSuccessful();
                    return aVar;
                } finally {
                    sQLiteDatabaseC.endTransaction();
                }
            case 26:
                s5.i iVar2 = (s5.i) ((s5.d) obj);
                long jD = iVar2.f8440b.d() - iVar2.f8442d.f8429d;
                SQLiteDatabase sQLiteDatabaseC2 = iVar2.c();
                sQLiteDatabaseC2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jD)};
                    Cursor cursorRawQuery = sQLiteDatabaseC2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            iVar2.B(cursorRawQuery.getInt(0), o5.c.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseC2.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseC2.setTransactionSuccessful();
                    sQLiteDatabaseC2.endTransaction();
                    return Integer.valueOf(iDelete);
                } catch (Throwable th2) {
                    sQLiteDatabaseC2.endTransaction();
                    throw th2;
                }
            case 27:
                s5.i iVar3 = (s5.i) ((s5.c) ((c3.j) obj).i);
                SQLiteDatabase sQLiteDatabaseC3 = iVar3.c();
                sQLiteDatabaseC3.beginTransaction();
                try {
                    sQLiteDatabaseC3.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseC3.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + iVar3.f8440b.d()).execute();
                    sQLiteDatabaseC3.setTransactionSuccessful();
                    return null;
                } finally {
                    sQLiteDatabaseC3.endTransaction();
                }
            default:
                a3.j jVar2 = (a3.j) obj;
                Iterator it = ((Iterable) ((s5.i) ((s5.d) jVar2.f108b)).g(new s5.e(i10))).iterator();
                while (it.hasNext()) {
                    ((q5.d) jVar2.f109c).i((l5.i) it.next(), 1, false);
                }
                return null;
        }
    }

    public j5.b g(a2.l lVar) throws IOException {
        j5.c cVar = (j5.c) this.f185b;
        URL url = (URL) lVar.f43b;
        String strH = a.a.h("CctTransportBackend");
        if (Log.isLoggable(strH, 4)) {
            Log.i(strH, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.f5700g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) lVar.f45d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    ta.c cVar2 = cVar.f5695a;
                    k5.i iVar = (k5.i) lVar.f44c;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    ta.e eVar = (ta.e) cVar2.f8662a;
                    ta.f fVar = new ta.f(bufferedWriter, eVar.f8666a, eVar.f8667b, eVar.f8668c, eVar.f8669d);
                    fVar.h(iVar);
                    fVar.j();
                    fVar.f8671b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strH2 = a.a.h("CctTransportBackend");
                    if (Log.isLoggable(strH2, 4)) {
                        Log.i(strH2, String.format("Status Code: %d", numValueOf));
                    }
                    a.a.e(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    a.a.e(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new j5.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new j5.b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            j5.b bVar = new j5.b(responseCode, null, m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f6038a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } catch (Throwable th) {
                            if (gZIPInputStream == null) {
                                throw th;
                            }
                            try {
                                gZIPInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        if (inputStream == null) {
                            throw th3;
                        }
                        try {
                            inputStream.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                if (outputStream == null) {
                    throw th7;
                }
                try {
                    outputStream.close();
                    throw th7;
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        } catch (ConnectException e) {
            e = e;
            a.a.f(e, "CctTransportBackend", "Couldn't open connection, returning with 500");
            return new j5.b(500, null, 0L);
        } catch (UnknownHostException e4) {
            e = e4;
            a.a.f(e, "CctTransportBackend", "Couldn't open connection, returning with 500");
            return new j5.b(500, null, 0L);
        } catch (IOException e10) {
            e = e10;
            a.a.f(e, "CctTransportBackend", "Couldn't encode request, returning with 400");
            return new j5.b(400, null, 0L);
        } catch (ra.b e11) {
            e = e11;
            a.a.f(e, "CctTransportBackend", "Couldn't encode request, returning with 400");
            return new j5.b(400, null, 0L);
        }
    }

    public boolean h(a4.b bVar, int i, Bundle bundle) {
        q0.f eVar;
        l.t tVar = (l.t) this.f185b;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 25 && (i & 1) != 0) {
            try {
                ((t0.f) bVar.f113b).b();
                Parcelable parcelable = (Parcelable) ((t0.f) bVar.f113b).d();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        t0.f fVar = (t0.f) bVar.f113b;
        ClipData clipData = new ClipData(fVar.getDescription(), new ClipData.Item(fVar.a()));
        if (i10 >= 31) {
            eVar = new q0.e(clipData, 2);
        } else {
            q0.g gVar = new q0.g();
            gVar.f7898b = clipData;
            gVar.f7899c = 2;
            eVar = gVar;
        }
        eVar.b(fVar.c());
        eVar.setExtras(bundle);
        return v0.h(tVar, eVar.build()) == null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f184a) {
            case 9:
                a0.b((Intent) this.f185b);
                break;
            case 10:
                ((c0) this.f185b).f4449b.trySetResult(null);
                break;
            case 11:
                ((ScheduledFuture) this.f185b).cancel(false);
                break;
            default:
                h5.a aVar = (h5.a) this.f185b;
                aVar.getClass();
                if (task.isSuccessful()) {
                    aVar.f(h.c(aVar.f4968j));
                } else if (!(task.getException() instanceof com.google.android.gms.common.api.r)) {
                    Log.w("SmartLockViewModel", "Non-resolvable exception: " + task.getException());
                    aVar.f(h.a(new r4.g(0, "Error when saving credential.", task.getException())));
                } else {
                    aVar.f(h.a(new s4.e(100, ((com.google.android.gms.common.api.r) task.getException()).getStatus().f2047c)));
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i = this.f184a;
        Object obj = this.f185b;
        switch (i) {
            case 4:
                ((e5.g) obj).f(h.a(exc));
                break;
            case 5:
                g5.a aVar = (g5.a) obj;
                if (!(exc instanceof v9.l)) {
                    aVar.f(h.a(exc));
                } else {
                    aVar.g(((v9.l) exc).f9263b);
                }
                break;
            default:
                int i10 = KickoffActivity.P;
                ((KickoffActivity) obj).u(r4.i.d(new r4.g(2, c1.G(2), exc)), 0);
                break;
        }
    }

    @Override // androidx.webkit.WebViewCompat.WebViewStartUpCallback
    public void onSuccess(WebViewStartUpResult webViewStartUpResult) {
        WebViewCompat.lambda$startUpWebView$1((WebViewCompat.WebViewStartUpCallback) this.f185b, webViewStartUpResult);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws IOException {
        switch (this.f184a) {
            case 0:
                return task.isSuccessful() ? ((w9.a0) task.getResult()).f9802a.k((v9.d) this.f185b) : task;
            case 3:
                ((CountDownLatch) this.f185b).countDown();
                return null;
            default:
                ((v) this.f185b).getClass();
                Bundle bundle = (Bundle) task.getResult(IOException.class);
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        x xVar = (x) obj;
        if (((FirebaseMessaging) this.f185b).e.d()) {
            xVar.f();
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult((kb.g) this.f185b);
    }
}

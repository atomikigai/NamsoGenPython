package androidx.webkit.internal;

import android.util.Log;
import bd.v;
import com.bumptech.glide.manager.q;
import da.h;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import jb.k;
import kb.n;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1227b;

    public /* synthetic */ a(Object obj, int i) {
        this.f1226a = i;
        this.f1227b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        Map mapUnmodifiableMap;
        BufferedWriter bufferedWriter;
        kb.e eVarA;
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th;
        switch (this.f1226a) {
            case 0:
                return JavaScriptReplyProxyImpl.lambda$forInvocationHandler$0((JsReplyProxyBoundaryInterface) this.f1227b);
            case 1:
                return WebViewRenderProcessImpl.lambda$forInvocationHandler$0((WebViewRendererBoundaryInterface) this.f1227b);
            case 2:
                q qVar = (q) this.f1227b;
                BufferedWriter bufferedWriter2 = null;
                ((AtomicReference) qVar.f1934c).set(null);
                synchronized (qVar) {
                    if (((AtomicMarkableReference) qVar.f1933b).isMarked()) {
                        ea.b bVar = (ea.b) ((AtomicMarkableReference) qVar.f1933b).getReference();
                        synchronized (bVar) {
                            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(bVar.f3505a));
                        }
                        AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) qVar.f1933b;
                        atomicMarkableReference.set((ea.b) atomicMarkableReference.getReference(), false);
                    } else {
                        mapUnmodifiableMap = null;
                    }
                }
                if (mapUnmodifiableMap != null) {
                    v vVar = (v) qVar.f1935d;
                    ea.d dVar = (ea.d) vVar.f1682c;
                    String str = (String) vVar.f1681b;
                    File fileB = qVar.f1932a ? dVar.f3512a.b(str, "internal-keys") : dVar.f3512a.b(str, "keys");
                    try {
                        String string = new JSONObject(mapUnmodifiableMap).toString();
                        bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB), ea.d.f3511b));
                        try {
                            try {
                                bufferedWriter.write(string);
                                bufferedWriter.flush();
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedWriter2 = bufferedWriter;
                                h.c(bufferedWriter2, "Failed to close key/value metadata file.");
                                throw th;
                            }
                        } catch (Exception e) {
                            e = e;
                            Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
                            ea.d.d(fileB);
                        }
                    } catch (Exception e4) {
                        e = e4;
                        bufferedWriter = null;
                    } catch (Throwable th3) {
                        th = th3;
                        h.c(bufferedWriter2, "Failed to close key/value metadata file.");
                        throw th;
                    }
                    h.c(bufferedWriter, "Failed to close key/value metadata file.");
                    break;
                }
                return null;
            case 3:
                return ((k) this.f1227b).c();
            default:
                n nVar = (n) this.f1227b;
                synchronized (nVar) {
                    eVarA = null;
                    try {
                        try {
                            fileInputStreamOpenFileInput = nVar.f6203a.openFileInput(nVar.f6204b);
                            try {
                                int iAvailable = fileInputStreamOpenFileInput.available();
                                byte[] bArr = new byte[iAvailable];
                                fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                                eVarA = kb.e.a(new JSONObject(new String(bArr, "UTF-8")));
                                fileInputStreamOpenFileInput.close();
                            } catch (FileNotFoundException | JSONException unused) {
                                if (fileInputStreamOpenFileInput != null) {
                                    fileInputStreamOpenFileInput.close();
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                if (fileInputStreamOpenFileInput != null) {
                                    fileInputStreamOpenFileInput.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    } catch (FileNotFoundException | JSONException unused2) {
                        fileInputStreamOpenFileInput = null;
                    } catch (Throwable th6) {
                        fileInputStreamOpenFileInput = null;
                        th = th6;
                    }
                }
                return eVarA;
        }
    }
}

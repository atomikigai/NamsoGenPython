package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewStartUpConfig;
import app.namso_gen.spacehowen.R;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import da.b0;
import h6.o0;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f781d;

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i) {
        this.f778a = i;
        this.f779b = obj;
        this.f780c = obj2;
        this.f781d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONObject jSONObjectOptJSONObject;
        switch (this.f778a) {
            case 0:
                a4.i iVar = (a4.i) this.f779b;
                jd.l lVar = (jd.l) this.f780c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f781d;
                try {
                    s sVarI = jd.d.i(iVar.f150b);
                    if (sVarI == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    r rVar = (r) ((k) sVarI.f766b);
                    synchronized (rVar.f796d) {
                        rVar.f797f = threadPoolExecutor;
                        break;
                    }
                    ((k) sVarI.f766b).c(new n(lVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    lVar.r(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                WebViewCompat.lambda$startUpWebView$3((WebViewStartUpConfig) this.f779b, (WebViewCompat.WebViewStartUpCallback) this.f780c, (Context) this.f781d);
                return;
            case 2:
                d6.g gVar = (d6.g) this.f779b;
                Executor executor = (Executor) this.f780c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f781d;
                try {
                    ((Task) gVar.call()).continueWith(executor, new b0(taskCompletionSource, 2));
                    return;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 3:
                gb.g gVar2 = (gb.g) this.f779b;
                Intent intent = (Intent) this.f780c;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f781d;
                try {
                    gVar2.b(intent);
                    return;
                } finally {
                    taskCompletionSource2.setResult(null);
                }
            case 4:
                jb.h hVar = (jb.h) this.f779b;
                String str = (String) this.f780c;
                kb.e eVar = (kb.e) this.f781d;
                o0 o0Var = hVar.f5743a;
                r9.b bVar = (r9.b) ((ya.b) o0Var.f5061b).get();
                if (bVar == null) {
                    return;
                }
                JSONObject jSONObject = eVar.e;
                if (jSONObject.length() < 1) {
                    return;
                }
                JSONObject jSONObject2 = eVar.f6157b;
                if (jSONObject2.length() >= 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("choiceId");
                    if (strOptString.isEmpty()) {
                        return;
                    }
                    synchronized (((Map) o0Var.f5062c)) {
                        try {
                            if (!strOptString.equals(((Map) o0Var.f5062c).get(str))) {
                                ((Map) o0Var.f5062c).put(str, strOptString);
                                Bundle bundle = new Bundle();
                                bundle.putString("arm_key", str);
                                bundle.putString("arm_value", jSONObject2.optString(str));
                                bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                                bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                                bundle.putString("group", jSONObjectOptJSONObject.optString("group"));
                                r9.c cVar = (r9.c) bVar;
                                cVar.a("fp", "personalization_assignment", bundle);
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("_fpid", strOptString);
                                cVar.a("fp", "_fpc", bundle2);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
                return;
            default:
                l3.t tVar = (l3.t) this.f779b;
                n3.b bVar2 = (n3.b) this.f780c;
                n3.h hVar2 = (n3.h) this.f781d;
                j3.d dVar = tVar.f6678f0;
                if (dVar != null) {
                    TextView textView = dVar.f5685r;
                    TextView textView2 = dVar.f5684q;
                    Long l2 = tVar.f6680h0;
                    long j4 = bVar2.f7238a;
                    if (l2 != null && l2.longValue() == j4) {
                        dVar.f5682o.setVisibility(0);
                        String str2 = hVar2.f7267d;
                        int i = hVar2.f7269g;
                        if (str2 == null || i < 2) {
                            textView2.setText("❔");
                            textView.setText(tVar.v(R.string.viewer_connected_unknown));
                            return;
                        } else {
                            textView2.setText(n3.d.a(str2));
                            textView.setText(tVar.w(R.string.viewer_connected, n3.d.e(str2)));
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }
}

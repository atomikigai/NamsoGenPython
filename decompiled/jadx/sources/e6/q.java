package e6;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import com.google.android.gms.internal.ads.zzbhx;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbtd;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3393d;
    public final Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f3394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f3395g;

    public q(n3 n3Var, y2 y2Var, y2 y2Var2, zzbhx zzbhxVar, zzbtd zzbtdVar, y2 y2Var3) {
        this.f3390a = n3Var;
        this.f3391b = y2Var;
        this.f3392c = y2Var2;
        this.f3393d = zzbhxVar;
        this.e = zzbtdVar;
        this.f3395g = y2Var3;
    }

    public static q c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.item_proxy_result, viewGroup, false);
        int i = R.id.iv_flag;
        ImageView imageView = (ImageView) r7.g.o(viewInflate, R.id.iv_flag);
        if (imageView != null) {
            i = R.id.tv_addr;
            TextView textView = (TextView) r7.g.o(viewInflate, R.id.tv_addr);
            if (textView != null) {
                i = R.id.tv_delete;
                TextView textView2 = (TextView) r7.g.o(viewInflate, R.id.tv_delete);
                if (textView2 != null) {
                    i = R.id.tv_flag;
                    TextView textView3 = (TextView) r7.g.o(viewInflate, R.id.tv_flag);
                    if (textView3 != null) {
                        i = R.id.tv_meta;
                        TextView textView4 = (TextView) r7.g.o(viewInflate, R.id.tv_meta);
                        if (textView4 != null) {
                            i = R.id.tv_state;
                            TextView textView5 = (TextView) r7.g.o(viewInflate, R.id.tv_state);
                            if (textView5 != null) {
                                return new q((LinearLayout) viewInflate, imageView, textView, textView2, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public static void g(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        s sVar = s.f3427f;
        i6.d dVar = sVar.f3428a;
        String str2 = sVar.f3431d.f5213a;
        dVar.getClass();
        i6.d.n(context, str2, bundle, new wa.d(dVar));
    }

    public void a(int i, long j4) {
        if (i == 0) {
            new jb.f("Unable to fetch the latest version of the template.");
            e();
        } else {
            ((ScheduledExecutorService) this.f3394f).schedule(new kb.b(this, i, j4), ((Random) this.f3395g).nextInt(4), TimeUnit.SECONDS);
        }
    }

    public void b(InputStream inputStream) throws IOException {
        boolean zIsEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String strH = "";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            strH = da.v.h(strH, line);
            if (line.contains("}")) {
                int iIndexOf = strH.indexOf(123);
                int iLastIndexOf = strH.lastIndexOf(125);
                strH = (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : strH.substring(iIndexOf, iLastIndexOf + 1);
                if (strH.isEmpty()) {
                    continue;
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(strH);
                        if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                            kb.l lVar = (kb.l) this.e;
                            new jb.f("The server is temporarily unavailable. Try again in a few minutes.");
                            lVar.a();
                            break;
                        }
                        synchronized (this) {
                            zIsEmpty = ((LinkedHashSet) this.f3390a).isEmpty();
                        }
                        if (zIsEmpty) {
                            break;
                        }
                        if (jSONObject.has("latestTemplateVersionNumber")) {
                            long j4 = ((kb.h) this.f3392c).f6174g.f6183a.getLong("last_template_version", 0L);
                            long j10 = jSONObject.getLong("latestTemplateVersionNumber");
                            if (j10 > j4) {
                                a(3, j10);
                            }
                        }
                        strH = "";
                    } catch (JSONException e) {
                        new jb.c("Unable to parse config update message.", e.getCause());
                        e();
                        Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e);
                    }
                }
            }
        }
        bufferedReader.close();
        inputStream.close();
    }

    public void d() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f3391b;
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            b(inputStream);
            inputStream.close();
        } catch (IOException e) {
            Log.d("FirebaseRemoteConfig", "Stream was cancelled due to an exception. Retrying the connection...", e);
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public synchronized void e() {
        Iterator it = ((LinkedHashSet) this.f3390a).iterator();
        while (it.hasNext()) {
            ((kb.l) it.next()).a();
        }
    }

    public v0 f(Context context, zzbpg zzbpgVar) {
        return (v0) new m(this, context, zzbpgVar).d(context, false);
    }

    public q(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f3390a = linearLayout;
        this.f3391b = imageView;
        this.f3392c = textView;
        this.f3393d = textView2;
        this.e = textView3;
        this.f3394f = textView4;
        this.f3395g = textView5;
    }

    public q(HttpURLConnection httpURLConnection, kb.h hVar, kb.c cVar, LinkedHashSet linkedHashSet, kb.l lVar, ScheduledExecutorService scheduledExecutorService) {
        this.f3391b = httpURLConnection;
        this.f3392c = hVar;
        this.f3393d = cVar;
        this.f3390a = linkedHashSet;
        this.e = lVar;
        this.f3394f = scheduledExecutorService;
        this.f3395g = new Random();
    }

    public q(z3.d dVar, z3.d dVar2, z3.d dVar3, z3.d dVar4, w3.k kVar, w3.k kVar2) {
        this.f3395g = q4.d.a(150, new q3.e(this));
        this.f3390a = dVar;
        this.f3391b = dVar2;
        this.f3392c = dVar3;
        this.f3393d = dVar4;
        this.e = kVar;
        this.f3394f = kVar2;
    }
}

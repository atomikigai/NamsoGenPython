package l3;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.webkit.Profile;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import app.namso_gen.spacehowen.R;
import app.namso_gen.spacehowen.ui.browser.ProfileViewerActivity;
import com.google.firebase.auth.FirebaseAuth;
import h3.q1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends androidx.fragment.app.s {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public j3.d f6678f0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Long f6680h0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public androidx.fragment.app.b0 f6682j0;
    public Long k0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public Long f6685n0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final HashMap f6679g0 = new HashMap();

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final HashSet f6681i0 = new HashSet();

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final androidx.fragment.app.o f6683l0 = (androidx.fragment.app.o) S(new a5.a(this, 18), new androidx.fragment.app.e0(5));

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final h3.n f6684m0 = new h3.n(this);

    public static final void b0(t tVar, WebView webView) {
        j3.d dVar = tVar.f6678f0;
        if (dVar == null) {
            return;
        }
        TextView textView = dVar.f5686s;
        ImageView imageView = dVar.f5679l;
        String title = webView.getTitle();
        if (title == null || pc.g.m0(title)) {
            title = e0(webView.getUrl());
            if (pc.g.m0(title)) {
                title = textView.getText().toString();
            }
        }
        textView.setText(title);
        String url = webView.getUrl();
        if (url == null || pc.g.m0(url)) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setImageResource(pc.o.e0(url, "https://", false) ? R.drawable.secure : R.drawable.secure2);
        }
    }

    public static String e0(String str) {
        String host;
        if (str == null) {
            str = "";
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri != null && (host = uri.getHost()) != null) {
                String lowerCase = host.toLowerCase(Locale.ROOT);
                jc.i.d(lowerCase, "toLowerCase(...)");
                return lowerCase;
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    @Override // androidx.fragment.app.s
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jc.i.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_navigator, viewGroup, false);
        int i = R.id.btn_add_proxies;
        TextView textView = (TextView) r7.g.o(viewInflate, R.id.btn_add_proxies);
        if (textView != null) {
            i = R.id.btn_new_profile;
            TextView textView2 = (TextView) r7.g.o(viewInflate, R.id.btn_new_profile);
            if (textView2 != null) {
                i = R.id.btn_viewer_back;
                ImageView imageView = (ImageView) r7.g.o(viewInflate, R.id.btn_viewer_back);
                if (imageView != null) {
                    i = R.id.btn_viewer_close;
                    ImageView imageView2 = (ImageView) r7.g.o(viewInflate, R.id.btn_viewer_close);
                    if (imageView2 != null) {
                        i = R.id.btn_viewer_fwd;
                        ImageView imageView3 = (ImageView) r7.g.o(viewInflate, R.id.btn_viewer_fwd);
                        if (imageView3 != null) {
                            i = R.id.btn_viewer_min;
                            ImageView imageView4 = (ImageView) r7.g.o(viewInflate, R.id.btn_viewer_min);
                            if (imageView4 != null) {
                                i = R.id.btn_viewer_reload;
                                ImageView imageView5 = (ImageView) r7.g.o(viewInflate, R.id.btn_viewer_reload);
                                if (imageView5 != null) {
                                    i = R.id.cl_list;
                                    LinearLayout linearLayout = (LinearLayout) r7.g.o(viewInflate, R.id.cl_list);
                                    if (linearLayout != null) {
                                        i = R.id.cl_viewer;
                                        LinearLayout linearLayout2 = (LinearLayout) r7.g.o(viewInflate, R.id.cl_viewer);
                                        if (linearLayout2 != null) {
                                            i = R.id.frame_viewer;
                                            FrameLayout frameLayout = (FrameLayout) r7.g.o(viewInflate, R.id.frame_viewer);
                                            if (frameLayout != null) {
                                                i = R.id.img_connected;
                                                if (((ImageView) r7.g.o(viewInflate, R.id.img_connected)) != null) {
                                                    i = R.id.img_secure;
                                                    ImageView imageView6 = (ImageView) r7.g.o(viewInflate, R.id.img_secure);
                                                    if (imageView6 != null) {
                                                        i = R.id.profiles_empty;
                                                        TextView textView3 = (TextView) r7.g.o(viewInflate, R.id.profiles_empty);
                                                        if (textView3 != null) {
                                                            i = R.id.progress_viewer;
                                                            ProgressBar progressBar = (ProgressBar) r7.g.o(viewInflate, R.id.progress_viewer);
                                                            if (progressBar != null) {
                                                                i = R.id.row_proxy_ip;
                                                                LinearLayout linearLayout3 = (LinearLayout) r7.g.o(viewInflate, R.id.row_proxy_ip);
                                                                if (linearLayout3 != null) {
                                                                    i = R.id.rv_profiles;
                                                                    RecyclerView recyclerView = (RecyclerView) r7.g.o(viewInflate, R.id.rv_profiles);
                                                                    if (recyclerView != null) {
                                                                        i = R.id.tv_proxy_flag;
                                                                        TextView textView4 = (TextView) r7.g.o(viewInflate, R.id.tv_proxy_flag);
                                                                        if (textView4 != null) {
                                                                            i = R.id.tv_proxy_ip;
                                                                            TextView textView5 = (TextView) r7.g.o(viewInflate, R.id.tv_proxy_ip);
                                                                            if (textView5 != null) {
                                                                                i = R.id.tv_viewer_name;
                                                                                TextView textView6 = (TextView) r7.g.o(viewInflate, R.id.tv_viewer_name);
                                                                                if (textView6 != null) {
                                                                                    FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                                                                                    this.f6678f0 = new j3.d(frameLayout2, textView, textView2, imageView, imageView2, imageView3, imageView4, imageView5, linearLayout, linearLayout2, frameLayout, imageView6, textView3, progressBar, linearLayout3, recyclerView, textView4, textView5, textView6);
                                                                                    jc.i.d(frameLayout2, "getRoot(...)");
                                                                                    return frameLayout2;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // androidx.fragment.app.s
    public final void F() {
        j3.d dVar = this.f6678f0;
        if (dVar != null) {
            dVar.f5678k.removeAllViews();
        }
        q1 q1Var = qd.b.f8070b;
        if (q1Var != null) {
            q1Var.invoke(Boolean.FALSE);
        }
        qd.b.f8069a = null;
        qd.b.f8072d = null;
        this.f6678f0 = null;
        this.N = true;
    }

    @Override // androidx.fragment.app.s
    public final void I() {
        long jLongValue;
        n3.b bVarE;
        this.N = true;
        if (FirebaseAuth.getInstance().f2702f == null) {
            ArrayList arrayList = new ArrayList();
            Long l2 = this.f6680h0;
            if (l2 != null && (bVarE = p3.a.e((jLongValue = l2.longValue()))) != null && bVarE.b()) {
                arrayList.add(Long.valueOf(jLongValue));
            }
            Iterator it = this.f6681i0.iterator();
            jc.i.d(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                jc.i.d(next, "next(...)");
                long jLongValue2 = ((Number) next).longValue();
                n3.b bVarE2 = p3.a.e(jLongValue2);
                if (bVarE2 != null && bVarE2.b()) {
                    arrayList.add(Long.valueOf(jLongValue2));
                }
            }
            Iterator it2 = arrayList.iterator();
            jc.i.d(it2, "iterator(...)");
            while (it2.hasNext()) {
                Object next2 = it2.next();
                jc.i.d(next2, "next(...)");
                g0(((Number) next2).longValue(), false);
            }
        }
        this.f6684m0.k();
    }

    @Override // androidx.fragment.app.s
    public final void M(Bundle bundle, View view) {
        j3.d dVar;
        jc.i.e(view, "view");
        j3.d dVar2 = this.f6678f0;
        if (dVar2 == null) {
            return;
        }
        RecyclerView recyclerView = dVar2.f5683p;
        U();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        dVar2.f5683p.setAdapter(this.f6684m0);
        this.f6684m0.k();
        final int i = 0;
        dVar2.f5673c.setOnClickListener(new View.OnClickListener(this) { // from class: l3.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f6578b;

            {
                this.f6578b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        List listN = p3.a.n();
                        t tVar = this.f6578b;
                        if (!tVar.U().getSharedPreferences("app_settings", 0).getBoolean("is_premium_cached", false) && listN.size() >= 2) {
                            androidx.fragment.app.i0 i0VarT = tVar.t();
                            androidx.fragment.app.s sVarY = i0VarT.y("SubscriptionDialog");
                            m3.b bVar = sVarY instanceof m3.b ? (m3.b) sVarY : null;
                            if (bVar == null || !bVar.y()) {
                                m3.b bVar2 = new m3.b();
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("arg_reason", "profiles_limit");
                                bVar2.Y(bundle2);
                                bVar2.e0(i0VarT, "SubscriptionDialog");
                            }
                        } else {
                            r7.g.C(tVar.T(), null, new k(tVar, 0));
                        }
                        break;
                    case 1:
                        android.support.v4.media.session.a.y(this.f6578b.T(), new i2.c(2));
                        break;
                    case 2:
                        WebView webViewD0 = this.f6578b.d0();
                        if (webViewD0 != null && webViewD0.canGoBack()) {
                            webViewD0.goBack();
                            break;
                        }
                        break;
                    case 3:
                        WebView webViewD1 = this.f6578b.d0();
                        if (webViewD1 != null && webViewD1.canGoForward()) {
                            webViewD1.goForward();
                            break;
                        }
                        break;
                    case 4:
                        WebView webViewD2 = this.f6578b.d0();
                        if (webViewD2 != null) {
                            webViewD2.reload();
                        }
                        break;
                    case 5:
                        this.f6578b.h0();
                        break;
                    default:
                        this.f6578b.c0();
                        break;
                }
            }
        });
        final int i10 = 1;
        dVar2.f5672b.setOnClickListener(new View.OnClickListener(this) { // from class: l3.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f6578b;

            {
                this.f6578b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        List listN = p3.a.n();
                        t tVar = this.f6578b;
                        if (!tVar.U().getSharedPreferences("app_settings", 0).getBoolean("is_premium_cached", false) && listN.size() >= 2) {
                            androidx.fragment.app.i0 i0VarT = tVar.t();
                            androidx.fragment.app.s sVarY = i0VarT.y("SubscriptionDialog");
                            m3.b bVar = sVarY instanceof m3.b ? (m3.b) sVarY : null;
                            if (bVar == null || !bVar.y()) {
                                m3.b bVar2 = new m3.b();
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("arg_reason", "profiles_limit");
                                bVar2.Y(bundle2);
                                bVar2.e0(i0VarT, "SubscriptionDialog");
                            }
                        } else {
                            r7.g.C(tVar.T(), null, new k(tVar, 0));
                        }
                        break;
                    case 1:
                        android.support.v4.media.session.a.y(this.f6578b.T(), new i2.c(2));
                        break;
                    case 2:
                        WebView webViewD0 = this.f6578b.d0();
                        if (webViewD0 != null && webViewD0.canGoBack()) {
                            webViewD0.goBack();
                            break;
                        }
                        break;
                    case 3:
                        WebView webViewD1 = this.f6578b.d0();
                        if (webViewD1 != null && webViewD1.canGoForward()) {
                            webViewD1.goForward();
                            break;
                        }
                        break;
                    case 4:
                        WebView webViewD2 = this.f6578b.d0();
                        if (webViewD2 != null) {
                            webViewD2.reload();
                        }
                        break;
                    case 5:
                        this.f6578b.h0();
                        break;
                    default:
                        this.f6578b.c0();
                        break;
                }
            }
        });
        final int i11 = 2;
        dVar2.f5674d.setOnClickListener(new View.OnClickListener(this) { // from class: l3.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f6578b;

            {
                this.f6578b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        List listN = p3.a.n();
                        t tVar = this.f6578b;
                        if (!tVar.U().getSharedPreferences("app_settings", 0).getBoolean("is_premium_cached", false) && listN.size() >= 2) {
                            androidx.fragment.app.i0 i0VarT = tVar.t();
                            androidx.fragment.app.s sVarY = i0VarT.y("SubscriptionDialog");
                            m3.b bVar = sVarY instanceof m3.b ? (m3.b) sVarY : null;
                            if (bVar == null || !bVar.y()) {
                                m3.b bVar2 = new m3.b();
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("arg_reason", "profiles_limit");
                                bVar2.Y(bundle2);
                                bVar2.e0(i0VarT, "SubscriptionDialog");
                            }
                        } else {
                            r7.g.C(tVar.T(), null, new k(tVar, 0));
                        }
                        break;
                    case 1:
                        android.support.v4.media.session.a.y(this.f6578b.T(), new i2.c(2));
                        break;
                    case 2:
                        WebView webViewD0 = this.f6578b.d0();
                        if (webViewD0 != null && webViewD0.canGoBack()) {
                            webViewD0.goBack();
                            break;
                        }
                        break;
                    case 3:
                        WebView webViewD1 = this.f6578b.d0();
                        if (webViewD1 != null && webViewD1.canGoForward()) {
                            webViewD1.goForward();
                            break;
                        }
                        break;
                    case 4:
                        WebView webViewD2 = this.f6578b.d0();
                        if (webViewD2 != null) {
                            webViewD2.reload();
                        }
                        break;
                    case 5:
                        this.f6578b.h0();
                        break;
                    default:
                        this.f6578b.c0();
                        break;
                }
            }
        });
        final int i12 = 3;
        dVar2.f5675f.setOnClickListener(new View.OnClickListener(this) { // from class: l3.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f6578b;

            {
                this.f6578b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        List listN = p3.a.n();
                        t tVar = this.f6578b;
                        if (!tVar.U().getSharedPreferences("app_settings", 0).getBoolean("is_premium_cached", false) && listN.size() >= 2) {
                            androidx.fragment.app.i0 i0VarT = tVar.t();
                            androidx.fragment.app.s sVarY = i0VarT.y("SubscriptionDialog");
                            m3.b bVar = sVarY instanceof m3.b ? (m3.b) sVarY : null;
                            if (bVar == null || !bVar.y()) {
                                m3.b bVar2 = new m3.b();
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("arg_reason", "profiles_limit");
                                bVar2.Y(bundle2);
                                bVar2.e0(i0VarT, "SubscriptionDialog");
                            }
                        } else {
                            r7.g.C(tVar.T(), null, new k(tVar, 0));
                        }
                        break;
                    case 1:
                        android.support.v4.media.session.a.y(this.f6578b.T(), new i2.c(2));
                        break;
                    case 2:
                        WebView webViewD0 = this.f6578b.d0();
                        if (webViewD0 != null && webViewD0.canGoBack()) {
                            webViewD0.goBack();
                            break;
                        }
                        break;
                    case 3:
                        WebView webViewD1 = this.f6578b.d0();
                        if (webViewD1 != null && webViewD1.canGoForward()) {
                            webViewD1.goForward();
                            break;
                        }
                        break;
                    case 4:
                        WebView webViewD2 = this.f6578b.d0();
                        if (webViewD2 != null) {
                            webViewD2.reload();
                        }
                        break;
                    case 5:
                        this.f6578b.h0();
                        break;
                    default:
                        this.f6578b.c0();
                        break;
                }
            }
        });
        final int i13 = 4;
        dVar2.h.setOnClickListener(new View.OnClickListener(this) { // from class: l3.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f6578b;

            {
                this.f6578b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        List listN = p3.a.n();
                        t tVar = this.f6578b;
                        if (!tVar.U().getSharedPreferences("app_settings", 0).getBoolean("is_premium_cached", false) && listN.size() >= 2) {
                            androidx.fragment.app.i0 i0VarT = tVar.t();
                            androidx.fragment.app.s sVarY = i0VarT.y("SubscriptionDialog");
                            m3.b bVar = sVarY instanceof m3.b ? (m3.b) sVarY : null;
                            if (bVar == null || !bVar.y()) {
                                m3.b bVar2 = new m3.b();
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("arg_reason", "profiles_limit");
                                bVar2.Y(bundle2);
                                bVar2.e0(i0VarT, "SubscriptionDialog");
                            }
                        } else {
                            r7.g.C(tVar.T(), null, new k(tVar, 0));
                        }
                        break;
                    case 1:
                        android.support.v4.media.session.a.y(this.f6578b.T(), new i2.c(2));
                        break;
                    case 2:
                        WebView webViewD0 = this.f6578b.d0();
                        if (webViewD0 != null && webViewD0.canGoBack()) {
                            webViewD0.goBack();
                            break;
                        }
                        break;
                    case 3:
                        WebView webViewD1 = this.f6578b.d0();
                        if (webViewD1 != null && webViewD1.canGoForward()) {
                            webViewD1.goForward();
                            break;
                        }
                        break;
                    case 4:
                        WebView webViewD2 = this.f6578b.d0();
                        if (webViewD2 != null) {
                            webViewD2.reload();
                        }
                        break;
                    case 5:
                        this.f6578b.h0();
                        break;
                    default:
                        this.f6578b.c0();
                        break;
                }
            }
        });
        final int i14 = 5;
        dVar2.f5676g.setOnClickListener(new View.OnClickListener(this) { // from class: l3.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f6578b;

            {
                this.f6578b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        List listN = p3.a.n();
                        t tVar = this.f6578b;
                        if (!tVar.U().getSharedPreferences("app_settings", 0).getBoolean("is_premium_cached", false) && listN.size() >= 2) {
                            androidx.fragment.app.i0 i0VarT = tVar.t();
                            androidx.fragment.app.s sVarY = i0VarT.y("SubscriptionDialog");
                            m3.b bVar = sVarY instanceof m3.b ? (m3.b) sVarY : null;
                            if (bVar == null || !bVar.y()) {
                                m3.b bVar2 = new m3.b();
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("arg_reason", "profiles_limit");
                                bVar2.Y(bundle2);
                                bVar2.e0(i0VarT, "SubscriptionDialog");
                            }
                        } else {
                            r7.g.C(tVar.T(), null, new k(tVar, 0));
                        }
                        break;
                    case 1:
                        android.support.v4.media.session.a.y(this.f6578b.T(), new i2.c(2));
                        break;
                    case 2:
                        WebView webViewD0 = this.f6578b.d0();
                        if (webViewD0 != null && webViewD0.canGoBack()) {
                            webViewD0.goBack();
                            break;
                        }
                        break;
                    case 3:
                        WebView webViewD1 = this.f6578b.d0();
                        if (webViewD1 != null && webViewD1.canGoForward()) {
                            webViewD1.goForward();
                            break;
                        }
                        break;
                    case 4:
                        WebView webViewD2 = this.f6578b.d0();
                        if (webViewD2 != null) {
                            webViewD2.reload();
                        }
                        break;
                    case 5:
                        this.f6578b.h0();
                        break;
                    default:
                        this.f6578b.c0();
                        break;
                }
            }
        });
        final int i15 = 6;
        dVar2.e.setOnClickListener(new View.OnClickListener(this) { // from class: l3.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f6578b;

            {
                this.f6578b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        List listN = p3.a.n();
                        t tVar = this.f6578b;
                        if (!tVar.U().getSharedPreferences("app_settings", 0).getBoolean("is_premium_cached", false) && listN.size() >= 2) {
                            androidx.fragment.app.i0 i0VarT = tVar.t();
                            androidx.fragment.app.s sVarY = i0VarT.y("SubscriptionDialog");
                            m3.b bVar = sVarY instanceof m3.b ? (m3.b) sVarY : null;
                            if (bVar == null || !bVar.y()) {
                                m3.b bVar2 = new m3.b();
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("arg_reason", "profiles_limit");
                                bVar2.Y(bundle2);
                                bVar2.e0(i0VarT, "SubscriptionDialog");
                            }
                        } else {
                            r7.g.C(tVar.T(), null, new k(tVar, 0));
                        }
                        break;
                    case 1:
                        android.support.v4.media.session.a.y(this.f6578b.T(), new i2.c(2));
                        break;
                    case 2:
                        WebView webViewD0 = this.f6578b.d0();
                        if (webViewD0 != null && webViewD0.canGoBack()) {
                            webViewD0.goBack();
                            break;
                        }
                        break;
                    case 3:
                        WebView webViewD1 = this.f6578b.d0();
                        if (webViewD1 != null && webViewD1.canGoForward()) {
                            webViewD1.goForward();
                            break;
                        }
                        break;
                    case 4:
                        WebView webViewD2 = this.f6578b.d0();
                        if (webViewD2 != null) {
                            webViewD2.reload();
                        }
                        break;
                    case 5:
                        this.f6578b.h0();
                        break;
                    default:
                        this.f6578b.c0();
                        break;
                }
            }
        });
        this.f6682j0 = new androidx.fragment.app.b0(this, this.f6680h0 != null);
        androidx.activity.b0 b0VarM = T().m();
        androidx.fragment.app.t0 t0VarX = x();
        androidx.fragment.app.b0 b0Var = this.f6682j0;
        jc.i.b(b0Var);
        b0VarM.a(t0VarX, b0Var);
        qd.b.f8069a = new k(this, 3);
        Long l2 = this.f6680h0;
        if (l2 != null) {
            long jLongValue = l2.longValue();
            if (((WebView) this.f6679g0.get(Long.valueOf(jLongValue))) != null && (dVar = this.f6678f0) != null) {
                FrameLayout frameLayout = dVar.f5678k;
                WebView webView = (WebView) this.f6679g0.get(Long.valueOf(jLongValue));
                if (webView != null) {
                    dVar.f5677j.setVisibility(0);
                    dVar.i.setVisibility(8);
                    frameLayout.removeAllViews();
                    frameLayout.addView(webView, new FrameLayout.LayoutParams(-1, -1));
                    m0(webView);
                    androidx.fragment.app.b0 b0Var2 = this.f6682j0;
                    if (b0Var2 != null) {
                        b0Var2.a(true);
                    }
                    l0();
                    this.f6684m0.k();
                }
            }
        }
        qd.b.f8072d = new a2.d(this, 6);
        l0();
    }

    public final void c0() {
        Long l2 = this.f6680h0;
        if (l2 != null) {
            long jLongValue = l2.longValue();
            Log.i("KRYPT-PROXY", "viewer #" + jLongValue + " ✕ → closeProfile inmediato");
            g0(jLongValue, true);
        }
    }

    public final WebView d0() {
        Long l2 = this.f6680h0;
        if (l2 == null) {
            return null;
        }
        return (WebView) this.f6679g0.get(Long.valueOf(l2.longValue()));
    }

    public final boolean f0(n3.b bVar) {
        n3.i iVar = n3.i.f7270a;
        long j4 = bVar.f7238a;
        if (n3.i.e(j4)) {
            return true;
        }
        Long l2 = this.f6680h0;
        return (l2 != null && l2.longValue() == j4) || this.f6681i0.contains(Long.valueOf(j4)) || ProfileViewerActivity.P.containsKey(Long.valueOf(j4)) || ProfileViewerActivity.T.contains(Long.valueOf(j4));
    }

    public final void g0(long j4, boolean z4) {
        Log.i("KRYPT-PROXY", "killProfile #" + j4 + " → closeProfile inmediato (wipe=siempre)");
        SharedPreferences sharedPreferences = i3.p.f5195a;
        if (sharedPreferences == null) {
            throw new IllegalStateException("Prefs.init(context) no llamado");
        }
        boolean z10 = sharedPreferences.getBoolean("viewer_embedded", true);
        h3.n nVar = this.f6684m0;
        if (!z10) {
            ConcurrentHashMap concurrentHashMap = ProfileViewerActivity.P;
            a.a.c(j4);
            if (z4) {
                Toast.makeText(U(), R.string.profile_traces_cleared, 0).show();
            }
            nVar.k();
            return;
        }
        n3.i.f7270a.c(j4);
        this.f6681i0.remove(Long.valueOf(j4));
        WebView webView = (WebView) this.f6679g0.remove(Long.valueOf(j4));
        if (webView != null) {
            if (webView.getParent() != null) {
                ViewParent parent = webView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
            }
            try {
                webView.destroy();
            } catch (Throwable th) {
                r7.g.m(th);
            }
        }
        if (!n9.b.j(j4)) {
            n9.b.e(j4);
        }
        Long l2 = this.f6680h0;
        if (l2 != null && j4 == l2.longValue()) {
            k0();
        } else {
            nVar.k();
        }
        l0();
        if (z4) {
            Toast.makeText(U(), R.string.profile_traces_cleared, 0).show();
        }
    }

    public final void h0() {
        Long l2 = this.f6680h0;
        if (l2 != null) {
            Log.i("KRYPT-PROXY", "viewer #" + l2.longValue() + " minimizado — sesión sigue viva");
            Toast.makeText(U(), R.string.profile_minimized, 0).show();
            this.f6681i0.add(l2);
            k0();
        }
    }

    public final boolean i0(n3.b bVar) {
        boolean zB = bVar.b();
        long j4 = bVar.f7238a;
        if (!zB) {
            return j0(bVar);
        }
        v9.n nVar = FirebaseAuth.getInstance().f2702f;
        if (nVar != null) {
            Long l2 = this.f6685n0;
            if (l2 != null && l2.longValue() == j4) {
                return true;
            }
            this.f6685n0 = Long.valueOf(j4);
            rc.b0.q(androidx.lifecycle.i0.e(x()), null, new a2.e(nVar, this, bVar, null, 6), 3);
            return true;
        }
        Toast.makeText(U(), R.string.premium_proxy_sign_in_required, 0).show();
        this.k0 = Long.valueOf(j4);
        ArrayList arrayListQ = vb.j.Q(new h6.o0(29).d());
        r4.d dVar = new r4.d(r4.e.a(n9.g.d()));
        dVar.b(arrayListQ);
        dVar.f8150d = false;
        dVar.e = false;
        this.f6683l0.a(dVar.a());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v9, types: [boolean] */
    public final boolean j0(n3.b bVar) {
        boolean z4;
        String string;
        boolean z10;
        Object objM;
        int i;
        ?? r10;
        Object next;
        int i10;
        Object next2;
        String str;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        n3.i iVar = n3.i.f7270a;
        vb.o.W(n3.i.a(), linkedHashSet);
        Long l2 = this.f6680h0;
        if (l2 != null) {
            linkedHashSet.add(Long.valueOf(l2.longValue()));
        }
        Set setKeySet = this.f6679g0.keySet();
        jc.i.d(setKeySet, "<get-keys>(...)");
        vb.o.W(setKeySet, linkedHashSet);
        vb.o.W(this.f6681i0, linkedHashSet);
        Set setKeySet2 = ProfileViewerActivity.P.keySet();
        jc.i.d(setKeySet2, "<get-keys>(...)");
        ConcurrentHashMap.KeySetView keySetView = ProfileViewerActivity.T;
        jc.i.d(keySetView, "access$getSuspended$cp(...)");
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(vb.t.A(setKeySet2.size() + keySetView.size()));
        linkedHashSet2.addAll(setKeySet2);
        vb.o.W(keySetView, linkedHashSet2);
        vb.o.W(vb.i.n0(linkedHashSet2), linkedHashSet);
        List listN0 = vb.i.n0(linkedHashSet);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listN0) {
            if (((Number) obj).longValue() != bVar.f7238a) {
                arrayList.add(obj);
            }
        }
        int i11 = 2;
        if (!arrayList.isEmpty()) {
            Iterator it = p3.a.n().iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (((n3.b) next2).f7238a != ((Number) vb.i.Z(arrayList)).longValue());
            n3.b bVar2 = (n3.b) next2;
            if (bVar2 == null || (str = bVar2.f7239b) == null) {
                str = "#" + ((Number) vb.i.Z(arrayList)).longValue();
            }
            StringBuilder sbN = q1.a.n("gate: ya hay perfil activo ('", str, "' #");
            sbN.append(((Number) vb.i.Z(arrayList)).longValue());
            sbN.append(") al abrir '");
            sbN.append(bVar.f7239b);
            sbN.append('\'');
            Log.i("KRYPT-PROXY", sbN.toString());
            ea.j jVar = new ea.j((Context) T(), R.style.KryptProxyDialog);
            jVar.l(R.string.profiles_single_active_title);
            ((g.b) jVar.f3530b).f3972f = w(R.string.profiles_single_active_msg, str);
            jVar.k(w(R.string.profiles_single_active_ok, str), new h3.n0(arrayList, this, bVar, i11));
            jVar.g(R.string.cancel, null);
            jVar.m();
            return true;
        }
        SharedPreferences sharedPreferences = i3.p.f5195a;
        if (sharedPreferences == null) {
            throw new IllegalStateException("Prefs.init(context) no llamado");
        }
        if (!sharedPreferences.getBoolean("viewer_embedded", true)) {
            ConcurrentHashMap concurrentHashMap = ProfileViewerActivity.P;
            boolean zP = a.a.p(T(), bVar);
            if (zP) {
                this.f6684m0.k();
            }
            return zP;
        }
        boolean z11 = false;
        boolean z12 = !pc.g.m0(bVar.e) && 1 <= (i10 = bVar.f7242f) && i10 < 65536;
        StringBuilder sb2 = new StringBuilder("viewer.start '");
        sb2.append(bVar.f7239b);
        sb2.append("' id=");
        sb2.append(bVar.f7238a);
        sb2.append(" url=");
        sb2.append(bVar.f7240c);
        sb2.append(" tieneProxy=");
        sb2.append(z12);
        if (z12) {
            StringBuilder sb3 = new StringBuilder(" proxy=");
            z4 = true;
            sb3.append(bVar.e);
            sb3.append(':');
            sb3.append(bVar.f7242f);
            sb3.append(" tipo=");
            sb3.append(bVar.f7241d);
            sb3.append(" auth=");
            sb3.append(bVar.f7243g.length() > 0);
            sb3.append(" yaAbierta=");
            n3.i iVar2 = n3.i.f7270a;
            sb3.append(n3.i.e(bVar.f7238a));
            string = sb3.toString();
        } else {
            z4 = true;
            string = "";
        }
        sb2.append(string);
        Log.i("KRYPT-PROXY", sb2.toString());
        if (z12) {
            String strA = bVar.a();
            if (strA.length() == 0) {
                Log.w("KRYPT-PROXY", "dominio vacío para '" + bVar.f7239b + "' → no se enruta");
                return false;
            }
            Iterator it2 = p3.a.n().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z10 = z11;
                    next = null;
                    break;
                }
                next = it2.next();
                n3.b bVar3 = (n3.b) next;
                z10 = z11;
                if (bVar3.f7238a != bVar.f7238a && bVar3.c(bVar)) {
                    n3.i iVar3 = n3.i.f7270a;
                    if (n3.i.e(bVar3.f7238a)) {
                        break;
                    }
                }
                z11 = z10;
            }
            n3.b bVar4 = (n3.b) next;
            if (bVar4 != null) {
                Log.i("KRYPT-PROXY", "conflicto de sitio: '" + bVar4.f7239b + "' #" + bVar4.f7238a + " ya enruta '" + strA + "' → se pide cierre explícito");
                ea.j jVar2 = new ea.j((Context) T(), R.style.KryptProxyDialog);
                jVar2.l(R.string.profiles_open_conflict_title);
                ((g.b) jVar2.f3530b).f3972f = w(R.string.profiles_open_conflict_msg, bVar4.f7239b);
                jVar2.k(w(R.string.profiles_open_conflict_ok, bVar4.f7239b), new h3.n0(this, bVar4, bVar, 3));
                jVar2.g(R.string.cancel, null);
                jVar2.m();
                return z4;
            }
            n3.i iVar4 = n3.i.f7270a;
            boolean zH = n3.i.h(bVar.f7238a, bVar.f7241d, bVar.e, bVar.f7242f, bVar.f7243g, bVar.h, strA);
            Log.i("KRYPT-PROXY", "openProfile guía '" + bVar.f7239b + "' #" + bVar.f7238a + " → routeCoincide=" + zH + " rutaViva=" + n3.i.e(bVar.f7238a) + " proxy=" + bVar.e + ':' + bVar.f7242f + " dominio='" + strA + '\'');
            if (!zH) {
                if (n3.i.e(bVar.f7238a)) {
                    Log.i("KRYPT-PROXY", "perfil '" + bVar.f7239b + "' #" + bVar.f7238a + " editado → remontar ruta con el nuevo proxy");
                    iVar4.c(bVar.f7238a);
                }
                WebView webView = (WebView) this.f6679g0.remove(Long.valueOf(bVar.f7238a));
                if (webView != null) {
                    if (webView.getParent() != null) {
                        ViewParent parent = webView.getParent();
                        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                        if (viewGroup != null) {
                            viewGroup.removeView(webView);
                        }
                    }
                    try {
                        webView.destroy();
                    } catch (Throwable th) {
                        r7.g.m(th);
                    }
                    Log.i("KRYPT-PROXY", "perfil '" + bVar.f7239b + "' #" + bVar.f7238a + " proxy cambiado → WebView cacheado DESTRUIDO");
                }
                if (!n3.i.f7270a.f(bVar.f7238a, bVar.f7241d, bVar.e, bVar.f7242f, bVar.f7243g, bVar.h, strA)) {
                    Log.w("KRYPT-PROXY", "openProfile falló para '" + bVar.f7239b + '\'');
                    return z10;
                }
            }
        } else {
            z10 = false;
        }
        Long l10 = this.f6680h0;
        if (l10 != null) {
            if (l10.longValue() == bVar.f7238a) {
                l10 = null;
            }
            if (l10 != null) {
                this.f6681i0.add(Long.valueOf(l10.longValue()));
                Toast.makeText(U(), R.string.profile_minimized, z10 ? 1 : 0).show();
            }
        }
        this.f6681i0.remove(Long.valueOf(bVar.f7238a));
        this.f6680h0 = Long.valueOf(bVar.f7238a);
        j3.d dVar = this.f6678f0;
        if (dVar == null) {
            return z4;
        }
        q1 q1Var = qd.b.f8070b;
        if (q1Var != null) {
            q1Var.invoke(Boolean.TRUE);
        }
        dVar.f5677j.setVisibility(0);
        dVar.i.setVisibility(8);
        TextView textView = dVar.f5686s;
        String strE0 = e0(bVar.f7240c);
        if (pc.g.m0(strE0)) {
            strE0 = bVar.f7239b;
        }
        textView.setText(strE0);
        if (pc.g.m0(bVar.e) || (r10 = z4) > (i = bVar.f7242f) || i >= 65536) {
            dVar.f5682o.setVisibility(8);
        } else {
            dVar.f5682o.setVisibility(8);
            Thread thread = new Thread(new androidx.webkit.b(11, bVar, this));
            thread.setDaemon(r10);
            thread.start();
        }
        boolean zContainsKey = this.f6679g0.containsKey(Long.valueOf(bVar.f7238a));
        HashMap map = this.f6679g0;
        Long lValueOf = Long.valueOf(bVar.f7238a);
        Object obj2 = map.get(lValueOf);
        if (obj2 == null) {
            WebView webView2 = new WebView(U());
            if (WebViewFeature.isFeatureSupported(WebViewFeature.MULTI_PROFILE)) {
                long j4 = bVar.f7238a;
                Profile profileT = n9.b.t(j4);
                if (profileT != null) {
                    try {
                        WebViewCompat.setProfile(webView2, n9.b.s(j4));
                        objM = ub.k.f9073a;
                    } catch (Throwable th2) {
                        objM = r7.g.m(th2);
                    }
                    Object obj3 = objM;
                    if (!(obj3 instanceof ub.g)) {
                        try {
                            profileT.getCookieManager().setAcceptThirdPartyCookies(webView2, true);
                        } catch (Throwable th3) {
                            r7.g.m(th3);
                        }
                    }
                    Throwable thA = ub.h.a(obj3);
                    if (thA != null) {
                        StringBuilder sb4 = new StringBuilder("setProfile(");
                        sb4.append("krypt_p_" + j4);
                        sb4.append(") falló");
                        Log.w("KRYPT-PROXY", sb4.toString(), thA);
                    }
                } else {
                    Log.i("KRYPT-PROXY", "no se pudo crear el frasco para #" + j4 + " → frasco global");
                }
            }
            webView2.getSettings().setJavaScriptEnabled(true);
            webView2.getSettings().setDomStorageEnabled(true);
            webView2.getSettings().setDatabaseEnabled(true);
            webView2.getSettings().setMediaPlaybackRequiresUserGesture(true);
            webView2.getSettings().setAllowFileAccess(false);
            if (Build.VERSION.SDK_INT < 28) {
                webView2.getSettings().setSaveFormData(false);
            }
            try {
                WebSettingsCompat.setAlgorithmicDarkeningAllowed(webView2.getSettings(), true);
            } catch (Throwable unused) {
            }
            String userAgentString = webView2.getSettings().getUserAgentString();
            WebSettings settings = webView2.getSettings();
            jc.i.b(userAgentString);
            settings.setUserAgentString(pc.o.c0(pc.o.c0(userAgentString, "; wv", ""), "Version/4.0 ", ""));
            webView2.getSettings().setSupportMultipleWindows(true);
            webView2.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
            webView2.getSettings().setMixedContentMode(2);
            webView2.setWebViewClient(new d6.k(this, 1));
            webView2.setWebChromeClient(new s(webView2, this, 0));
            webView2.loadUrl(bVar.f7240c);
            Log.i("KRYPT-PROXY", "display #" + bVar.f7238a + " → WebView NUEVO (carga " + bVar.f7240c + ')');
            map.put(lValueOf, webView2);
            obj2 = webView2;
        }
        WebView webView3 = (WebView) obj2;
        if (zContainsKey) {
            Log.i("KRYPT-PROXY", "display #" + bVar.f7238a + " → WebView REUTILIZADO sin recarga (página viva)");
        }
        if (webView3.getParent() != null) {
            ViewParent parent2 = webView3.getParent();
            ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(webView3);
            }
        }
        dVar.f5678k.addView(webView3, new FrameLayout.LayoutParams(-1, -1));
        m0(webView3);
        androidx.fragment.app.b0 b0Var = this.f6682j0;
        if (b0Var != null) {
            b0Var.a(true);
        }
        l0();
        this.f6684m0.k();
        return true;
    }

    public final void k0() {
        this.f6680h0 = null;
        j3.d dVar = this.f6678f0;
        if (dVar == null) {
            return;
        }
        q1 q1Var = qd.b.f8070b;
        if (q1Var != null) {
            q1Var.invoke(Boolean.FALSE);
        }
        dVar.f5678k.removeAllViews();
        dVar.f5677j.setVisibility(8);
        dVar.i.setVisibility(0);
        androidx.fragment.app.b0 b0Var = this.f6682j0;
        if (b0Var != null) {
            b0Var.a(false);
        }
        l0();
        this.f6684m0.k();
    }

    public final void l0() {
        int size = this.f6679g0.size();
        Long l2 = this.f6680h0;
        qd.b.f8071c = size + ((l2 == null || this.f6679g0.containsKey(l2)) ? 0 : 1);
    }

    public final void m0(WebView webView) {
        j3.d dVar = this.f6678f0;
        if (dVar == null) {
            return;
        }
        ImageView imageView = dVar.f5675f;
        ImageView imageView2 = dVar.f5674d;
        boolean zCanGoBack = webView.canGoBack();
        boolean zCanGoForward = webView.canGoForward();
        imageView2.setEnabled(zCanGoBack);
        imageView2.setAlpha(zCanGoBack ? 1.0f : 0.35f);
        imageView.setEnabled(zCanGoForward);
        imageView.setAlpha(zCanGoForward ? 1.0f : 0.35f);
    }
}

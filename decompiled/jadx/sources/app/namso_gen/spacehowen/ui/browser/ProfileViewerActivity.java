package app.namso_gen.spacehowen.ui.browser;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
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
import androidx.fragment.app.b0;
import androidx.webkit.Profile;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import app.namso_gen.spacehowen.R;
import app.namso_gen.spacehowen.ui.browser.ProfileViewerActivity;
import b9.j;
import com.google.firebase.auth.FirebaseAuth;
import d6.k;
import da.v;
import g.g;
import ga.a;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import jc.i;
import l3.s;
import n3.b;
import pc.o;
import q0.j0;
import q0.v0;
import ub.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class ProfileViewerActivity extends g {
    public static final ConcurrentHashMap P = new ConcurrentHashMap();
    public static final ConcurrentHashMap Q = new ConcurrentHashMap();
    public static final ConcurrentHashMap R = new ConcurrentHashMap();
    public static final ConcurrentHashMap S = new ConcurrentHashMap();
    public static final ConcurrentHashMap.KeySetView T = ConcurrentHashMap.newKeySet();
    public j K;
    public WebView L;
    public long M;
    public boolean N;
    public String O;

    public static final void t(ProfileViewerActivity profileViewerActivity, WebView webView) {
        String title = webView.getTitle();
        j jVar = profileViewerActivity.K;
        if (jVar == null) {
            i.i("vb");
            throw null;
        }
        TextView textView = (TextView) jVar.f1476k;
        if (title == null || pc.g.m0(title)) {
            title = w(webView.getUrl());
            if (pc.g.m0(title)) {
                j jVar2 = profileViewerActivity.K;
                if (jVar2 == null) {
                    i.i("vb");
                    throw null;
                }
                title = ((TextView) jVar2.f1476k).getText().toString();
            }
        }
        textView.setText(title);
        String url = webView.getUrl();
        if (url == null || pc.g.m0(url)) {
            j jVar3 = profileViewerActivity.K;
            if (jVar3 != null) {
                ((ImageView) jVar3.f1473f).setVisibility(8);
                return;
            } else {
                i.i("vb");
                throw null;
            }
        }
        j jVar4 = profileViewerActivity.K;
        if (jVar4 == null) {
            i.i("vb");
            throw null;
        }
        ((ImageView) jVar4.f1473f).setVisibility(0);
        j jVar5 = profileViewerActivity.K;
        if (jVar5 != null) {
            ((ImageView) jVar5.f1473f).setImageResource(o.e0(url, "https://", false) ? R.drawable.secure : R.drawable.secure2);
        } else {
            i.i("vb");
            throw null;
        }
    }

    public static String w(String str) {
        String host;
        if (str == null) {
            str = "";
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri != null && (host = uri.getHost()) != null) {
                String lowerCase = host.toLowerCase(Locale.ROOT);
                i.d(lowerCase, "toLowerCase(...)");
                return lowerCase;
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    @Override // androidx.fragment.app.w, androidx.activity.m, d0.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        Object objM;
        String str4;
        int i;
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_profile_viewer, (ViewGroup) null, false);
        int i10 = R.id.btn_viewer_back;
        ImageView imageView = (ImageView) r7.g.o(viewInflate, R.id.btn_viewer_back);
        if (imageView != null) {
            i10 = R.id.btn_viewer_close;
            ImageView imageView2 = (ImageView) r7.g.o(viewInflate, R.id.btn_viewer_close);
            if (imageView2 != null) {
                i10 = R.id.btn_viewer_fwd;
                ImageView imageView3 = (ImageView) r7.g.o(viewInflate, R.id.btn_viewer_fwd);
                if (imageView3 != null) {
                    i10 = R.id.btn_viewer_min;
                    ImageView imageView4 = (ImageView) r7.g.o(viewInflate, R.id.btn_viewer_min);
                    if (imageView4 != null) {
                        i10 = R.id.btn_viewer_reload;
                        ImageView imageView5 = (ImageView) r7.g.o(viewInflate, R.id.btn_viewer_reload);
                        if (imageView5 != null) {
                            i10 = R.id.img_connected;
                            if (((ImageView) r7.g.o(viewInflate, R.id.img_connected)) != null) {
                                i10 = R.id.img_secure;
                                ImageView imageView6 = (ImageView) r7.g.o(viewInflate, R.id.img_secure);
                                if (imageView6 != null) {
                                    i10 = R.id.progress_viewer;
                                    ProgressBar progressBar = (ProgressBar) r7.g.o(viewInflate, R.id.progress_viewer);
                                    if (progressBar != null) {
                                        i10 = R.id.row_proxy_ip;
                                        LinearLayout linearLayout = (LinearLayout) r7.g.o(viewInflate, R.id.row_proxy_ip);
                                        if (linearLayout != null) {
                                            i10 = R.id.tv_proxy_flag;
                                            TextView textView = (TextView) r7.g.o(viewInflate, R.id.tv_proxy_flag);
                                            if (textView != null) {
                                                i10 = R.id.tv_proxy_ip;
                                                TextView textView2 = (TextView) r7.g.o(viewInflate, R.id.tv_proxy_ip);
                                                if (textView2 != null) {
                                                    i10 = R.id.tv_viewer_name;
                                                    TextView textView3 = (TextView) r7.g.o(viewInflate, R.id.tv_viewer_name);
                                                    if (textView3 != null) {
                                                        FrameLayout frameLayout = (FrameLayout) r7.g.o(viewInflate, R.id.wv_profile);
                                                        if (frameLayout != null) {
                                                            j jVar = new j();
                                                            jVar.f1469a = imageView;
                                                            jVar.f1470b = imageView2;
                                                            jVar.f1471c = imageView3;
                                                            jVar.f1472d = imageView4;
                                                            jVar.e = imageView5;
                                                            jVar.f1473f = imageView6;
                                                            jVar.f1474g = progressBar;
                                                            jVar.h = linearLayout;
                                                            jVar.i = textView;
                                                            jVar.f1475j = textView2;
                                                            jVar.f1476k = textView3;
                                                            jVar.f1477l = frameLayout;
                                                            this.K = jVar;
                                                            setContentView((LinearLayout) viewInflate);
                                                            View viewFindViewById = findViewById(android.R.id.content);
                                                            a aVar = new a(27);
                                                            WeakHashMap weakHashMap = v0.f7946a;
                                                            j0.u(viewFindViewById, aVar);
                                                            long longExtra = getIntent().getLongExtra("profile_id", 0L);
                                                            this.M = longExtra;
                                                            b bVarE = p3.a.e(longExtra);
                                                            final int i11 = 1;
                                                            if (bVarE != null && bVarE.b() && FirebaseAuth.getInstance().f2702f == null) {
                                                                Toast.makeText(this, R.string.premium_proxy_sign_in_required, 0).show();
                                                                finish();
                                                                return;
                                                            }
                                                            StringBuilder sb2 = new StringBuilder("viewer.onCreate '#");
                                                            sb2.append(this.M);
                                                            sb2.append("' instancia=");
                                                            sb2.append(System.identityHashCode(this));
                                                            sb2.append(" url=");
                                                            sb2.append(getIntent().getStringExtra("profile_url"));
                                                            sb2.append(" rutaViva=");
                                                            n3.i iVar = n3.i.f7270a;
                                                            sb2.append(n3.i.e(this.M));
                                                            Log.i("KRYPT-PROXY", sb2.toString());
                                                            String stringExtra = getIntent().getStringExtra("profile_name");
                                                            if (stringExtra == null) {
                                                                stringExtra = "Perfil";
                                                            }
                                                            String stringExtra2 = getIntent().getStringExtra("profile_url");
                                                            if (stringExtra2 == null) {
                                                                stringExtra2 = "";
                                                            }
                                                            j jVar2 = this.K;
                                                            if (jVar2 == null) {
                                                                i.i("vb");
                                                                throw null;
                                                            }
                                                            TextView textView4 = (TextView) jVar2.f1476k;
                                                            String strW = w(stringExtra2);
                                                            if (!pc.g.m0(strW)) {
                                                                stringExtra = strW;
                                                            }
                                                            textView4.setText(stringExtra);
                                                            b bVarE2 = p3.a.e(this.M);
                                                            if (bVarE2 != null) {
                                                                if (pc.g.m0(bVarE2.e) || 1 > (i = bVarE2.f7242f) || i >= 65536) {
                                                                    j jVar3 = this.K;
                                                                    if (jVar3 == null) {
                                                                        i.i("vb");
                                                                        throw null;
                                                                    }
                                                                    ((LinearLayout) jVar3.h).setVisibility(8);
                                                                } else {
                                                                    j jVar4 = this.K;
                                                                    if (jVar4 == null) {
                                                                        i.i("vb");
                                                                        throw null;
                                                                    }
                                                                    ((LinearLayout) jVar4.h).setVisibility(8);
                                                                    Thread thread = new Thread(new androidx.webkit.b(13, bVarE2, this));
                                                                    thread.setDaemon(true);
                                                                    thread.start();
                                                                }
                                                            }
                                                            WebView webView = (WebView) R.remove(Long.valueOf(this.M));
                                                            int i12 = 2;
                                                            String str5 = "wb";
                                                            if (webView != null) {
                                                                Log.i("KRYPT-PROXY", "viewer #" + this.M + " → WebView RECICLADO (página actual sin recarga)");
                                                                webView.setWebViewClient(new k(this, i12));
                                                                webView.setWebChromeClient(new s(webView, this, i11));
                                                                this.O = (i.a(S.remove(Long.valueOf(this.M)), Boolean.TRUE) && WebViewFeature.isFeatureSupported(WebViewFeature.MULTI_PROFILE)) ? v.g("krypt_p_", this.M) : null;
                                                                String title = webView.getTitle();
                                                                if (title != null) {
                                                                    if (pc.g.m0(title)) {
                                                                        title = null;
                                                                    }
                                                                    if (title != null) {
                                                                        j jVar5 = this.K;
                                                                        if (jVar5 == null) {
                                                                            i.i("vb");
                                                                            throw null;
                                                                        }
                                                                        ((TextView) jVar5.f1476k).setText(title);
                                                                    }
                                                                }
                                                                this.L = webView;
                                                                str = "KRYPT-PROXY";
                                                                str2 = "vb";
                                                                str5 = "wb";
                                                            } else {
                                                                WebView webView2 = new WebView(this);
                                                                this.L = webView2;
                                                                if (WebViewFeature.isFeatureSupported(WebViewFeature.MULTI_PROFILE)) {
                                                                    str2 = "vb";
                                                                    Profile profileT = n9.b.t(this.M);
                                                                    if (profileT != null) {
                                                                        str3 = "viewer #";
                                                                        try {
                                                                            WebViewCompat.setProfile(webView2, n9.b.s(this.M));
                                                                            objM = ub.k.f9073a;
                                                                        } catch (Throwable th) {
                                                                            objM = r7.g.m(th);
                                                                        }
                                                                        Object obj = objM;
                                                                        if (obj instanceof ub.g) {
                                                                            str4 = "KRYPT-PROXY";
                                                                        } else {
                                                                            str4 = "KRYPT-PROXY";
                                                                            this.O = v.g("krypt_p_", this.M);
                                                                            try {
                                                                                profileT.getCookieManager().setAcceptThirdPartyCookies(webView2, true);
                                                                            } catch (Throwable th2) {
                                                                                r7.g.m(th2);
                                                                            }
                                                                        }
                                                                        Throwable thA = h.a(obj);
                                                                        if (thA != null) {
                                                                            StringBuilder sb3 = new StringBuilder("setProfile(");
                                                                            sb3.append("krypt_p_" + this.M);
                                                                            sb3.append(") falló");
                                                                            str = str4;
                                                                            Log.w(str, sb3.toString(), thA);
                                                                        } else {
                                                                            str = str4;
                                                                        }
                                                                    } else {
                                                                        str = "KRYPT-PROXY";
                                                                        str3 = "viewer #";
                                                                        Log.i(str, "no se pudo crear el frasco para #" + this.M + " → frasco global");
                                                                    }
                                                                } else {
                                                                    str = "KRYPT-PROXY";
                                                                    str2 = "vb";
                                                                    str3 = "viewer #";
                                                                    Log.i(str, "WebView sin MULTI_PROFILE → frasco global");
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
                                                                i.b(userAgentString);
                                                                settings.setUserAgentString(o.c0(o.c0(userAgentString, "; wv", ""), "Version/4.0 ", ""));
                                                                webView2.getSettings().setSupportMultipleWindows(true);
                                                                webView2.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                                                                int i13 = 2;
                                                                webView2.getSettings().setMixedContentMode(2);
                                                                WebView webView3 = this.L;
                                                                if (webView3 == null) {
                                                                    i.i(str5);
                                                                    throw null;
                                                                }
                                                                webView3.setWebViewClient(new k(this, i13));
                                                                webView3.setWebChromeClient(new s(webView3, this, i11));
                                                                Log.i(str, str3 + this.M + " → NUEVO WebView (carga " + w(stringExtra2) + ')');
                                                                WebView webView4 = this.L;
                                                                if (webView4 == null) {
                                                                    i.i(str5);
                                                                    throw null;
                                                                }
                                                                webView4.loadUrl(stringExtra2);
                                                            }
                                                            j jVar6 = this.K;
                                                            if (jVar6 == null) {
                                                                i.i(str2);
                                                                throw null;
                                                            }
                                                            ((FrameLayout) jVar6.f1477l).removeAllViews();
                                                            j jVar7 = this.K;
                                                            if (jVar7 == null) {
                                                                i.i(str2);
                                                                throw null;
                                                            }
                                                            FrameLayout frameLayout2 = (FrameLayout) jVar7.f1477l;
                                                            WebView webView5 = this.L;
                                                            if (webView5 == null) {
                                                                i.i(str5);
                                                                throw null;
                                                            }
                                                            frameLayout2.addView(webView5, new FrameLayout.LayoutParams(-1, -1));
                                                            j jVar8 = this.K;
                                                            if (jVar8 == null) {
                                                                i.i(str2);
                                                                throw null;
                                                            }
                                                            final int i14 = 0;
                                                            ((ImageView) jVar8.f1469a).setOnClickListener(new View.OnClickListener(this) { // from class: l3.h0

                                                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                                public final /* synthetic */ ProfileViewerActivity f6569b;

                                                                {
                                                                    this.f6569b = this;
                                                                }

                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    int i15 = i14;
                                                                    ProfileViewerActivity profileViewerActivity = this.f6569b;
                                                                    switch (i15) {
                                                                        case 0:
                                                                            WebView webView6 = profileViewerActivity.L;
                                                                            if (webView6 == null) {
                                                                                jc.i.i("wb");
                                                                                throw null;
                                                                            }
                                                                            if (webView6.canGoBack()) {
                                                                                WebView webView7 = profileViewerActivity.L;
                                                                                if (webView7 != null) {
                                                                                    webView7.goBack();
                                                                                    return;
                                                                                } else {
                                                                                    jc.i.i("wb");
                                                                                    throw null;
                                                                                }
                                                                            }
                                                                            return;
                                                                        case 1:
                                                                            WebView webView8 = profileViewerActivity.L;
                                                                            if (webView8 == null) {
                                                                                jc.i.i("wb");
                                                                                throw null;
                                                                            }
                                                                            if (webView8.canGoForward()) {
                                                                                WebView webView9 = profileViewerActivity.L;
                                                                                if (webView9 != null) {
                                                                                    webView9.goForward();
                                                                                    return;
                                                                                } else {
                                                                                    jc.i.i("wb");
                                                                                    throw null;
                                                                                }
                                                                            }
                                                                            return;
                                                                        case 2:
                                                                            WebView webView10 = profileViewerActivity.L;
                                                                            if (webView10 != null) {
                                                                                webView10.reload();
                                                                                return;
                                                                            } else {
                                                                                jc.i.i("wb");
                                                                                throw null;
                                                                            }
                                                                        case 3:
                                                                            ConcurrentHashMap concurrentHashMap = ProfileViewerActivity.P;
                                                                            profileViewerActivity.v();
                                                                            return;
                                                                        default:
                                                                            ConcurrentHashMap concurrentHashMap2 = ProfileViewerActivity.P;
                                                                            profileViewerActivity.u();
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            j jVar9 = this.K;
                                                            if (jVar9 == null) {
                                                                i.i(str2);
                                                                throw null;
                                                            }
                                                            ((ImageView) jVar9.f1471c).setOnClickListener(new View.OnClickListener(this) { // from class: l3.h0

                                                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                                public final /* synthetic */ ProfileViewerActivity f6569b;

                                                                {
                                                                    this.f6569b = this;
                                                                }

                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    int i15 = i11;
                                                                    ProfileViewerActivity profileViewerActivity = this.f6569b;
                                                                    switch (i15) {
                                                                        case 0:
                                                                            WebView webView6 = profileViewerActivity.L;
                                                                            if (webView6 == null) {
                                                                                jc.i.i("wb");
                                                                                throw null;
                                                                            }
                                                                            if (webView6.canGoBack()) {
                                                                                WebView webView7 = profileViewerActivity.L;
                                                                                if (webView7 != null) {
                                                                                    webView7.goBack();
                                                                                    return;
                                                                                } else {
                                                                                    jc.i.i("wb");
                                                                                    throw null;
                                                                                }
                                                                            }
                                                                            return;
                                                                        case 1:
                                                                            WebView webView8 = profileViewerActivity.L;
                                                                            if (webView8 == null) {
                                                                                jc.i.i("wb");
                                                                                throw null;
                                                                            }
                                                                            if (webView8.canGoForward()) {
                                                                                WebView webView9 = profileViewerActivity.L;
                                                                                if (webView9 != null) {
                                                                                    webView9.goForward();
                                                                                    return;
                                                                                } else {
                                                                                    jc.i.i("wb");
                                                                                    throw null;
                                                                                }
                                                                            }
                                                                            return;
                                                                        case 2:
                                                                            WebView webView10 = profileViewerActivity.L;
                                                                            if (webView10 != null) {
                                                                                webView10.reload();
                                                                                return;
                                                                            } else {
                                                                                jc.i.i("wb");
                                                                                throw null;
                                                                            }
                                                                        case 3:
                                                                            ConcurrentHashMap concurrentHashMap = ProfileViewerActivity.P;
                                                                            profileViewerActivity.v();
                                                                            return;
                                                                        default:
                                                                            ConcurrentHashMap concurrentHashMap2 = ProfileViewerActivity.P;
                                                                            profileViewerActivity.u();
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            j jVar10 = this.K;
                                                            if (jVar10 == null) {
                                                                i.i(str2);
                                                                throw null;
                                                            }
                                                            final int i15 = 2;
                                                            ((ImageView) jVar10.e).setOnClickListener(new View.OnClickListener(this) { // from class: l3.h0

                                                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                                public final /* synthetic */ ProfileViewerActivity f6569b;

                                                                {
                                                                    this.f6569b = this;
                                                                }

                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    int i16 = i15;
                                                                    ProfileViewerActivity profileViewerActivity = this.f6569b;
                                                                    switch (i16) {
                                                                        case 0:
                                                                            WebView webView6 = profileViewerActivity.L;
                                                                            if (webView6 == null) {
                                                                                jc.i.i("wb");
                                                                                throw null;
                                                                            }
                                                                            if (webView6.canGoBack()) {
                                                                                WebView webView7 = profileViewerActivity.L;
                                                                                if (webView7 != null) {
                                                                                    webView7.goBack();
                                                                                    return;
                                                                                } else {
                                                                                    jc.i.i("wb");
                                                                                    throw null;
                                                                                }
                                                                            }
                                                                            return;
                                                                        case 1:
                                                                            WebView webView8 = profileViewerActivity.L;
                                                                            if (webView8 == null) {
                                                                                jc.i.i("wb");
                                                                                throw null;
                                                                            }
                                                                            if (webView8.canGoForward()) {
                                                                                WebView webView9 = profileViewerActivity.L;
                                                                                if (webView9 != null) {
                                                                                    webView9.goForward();
                                                                                    return;
                                                                                } else {
                                                                                    jc.i.i("wb");
                                                                                    throw null;
                                                                                }
                                                                            }
                                                                            return;
                                                                        case 2:
                                                                            WebView webView10 = profileViewerActivity.L;
                                                                            if (webView10 != null) {
                                                                                webView10.reload();
                                                                                return;
                                                                            } else {
                                                                                jc.i.i("wb");
                                                                                throw null;
                                                                            }
                                                                        case 3:
                                                                            ConcurrentHashMap concurrentHashMap = ProfileViewerActivity.P;
                                                                            profileViewerActivity.v();
                                                                            return;
                                                                        default:
                                                                            ConcurrentHashMap concurrentHashMap2 = ProfileViewerActivity.P;
                                                                            profileViewerActivity.u();
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            m().a(this, new b0(this));
                                                            j jVar11 = this.K;
                                                            if (jVar11 == null) {
                                                                i.i(str2);
                                                                throw null;
                                                            }
                                                            final int i16 = 3;
                                                            ((ImageView) jVar11.f1472d).setOnClickListener(new View.OnClickListener(this) { // from class: l3.h0

                                                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                                public final /* synthetic */ ProfileViewerActivity f6569b;

                                                                {
                                                                    this.f6569b = this;
                                                                }

                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    int i17 = i16;
                                                                    ProfileViewerActivity profileViewerActivity = this.f6569b;
                                                                    switch (i17) {
                                                                        case 0:
                                                                            WebView webView6 = profileViewerActivity.L;
                                                                            if (webView6 == null) {
                                                                                jc.i.i("wb");
                                                                                throw null;
                                                                            }
                                                                            if (webView6.canGoBack()) {
                                                                                WebView webView7 = profileViewerActivity.L;
                                                                                if (webView7 != null) {
                                                                                    webView7.goBack();
                                                                                    return;
                                                                                } else {
                                                                                    jc.i.i("wb");
                                                                                    throw null;
                                                                                }
                                                                            }
                                                                            return;
                                                                        case 1:
                                                                            WebView webView8 = profileViewerActivity.L;
                                                                            if (webView8 == null) {
                                                                                jc.i.i("wb");
                                                                                throw null;
                                                                            }
                                                                            if (webView8.canGoForward()) {
                                                                                WebView webView9 = profileViewerActivity.L;
                                                                                if (webView9 != null) {
                                                                                    webView9.goForward();
                                                                                    return;
                                                                                } else {
                                                                                    jc.i.i("wb");
                                                                                    throw null;
                                                                                }
                                                                            }
                                                                            return;
                                                                        case 2:
                                                                            WebView webView10 = profileViewerActivity.L;
                                                                            if (webView10 != null) {
                                                                                webView10.reload();
                                                                                return;
                                                                            } else {
                                                                                jc.i.i("wb");
                                                                                throw null;
                                                                            }
                                                                        case 3:
                                                                            ConcurrentHashMap concurrentHashMap = ProfileViewerActivity.P;
                                                                            profileViewerActivity.v();
                                                                            return;
                                                                        default:
                                                                            ConcurrentHashMap concurrentHashMap2 = ProfileViewerActivity.P;
                                                                            profileViewerActivity.u();
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            j jVar12 = this.K;
                                                            if (jVar12 == null) {
                                                                i.i(str2);
                                                                throw null;
                                                            }
                                                            final int i17 = 4;
                                                            ((ImageView) jVar12.f1470b).setOnClickListener(new View.OnClickListener(this) { // from class: l3.h0

                                                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                                public final /* synthetic */ ProfileViewerActivity f6569b;

                                                                {
                                                                    this.f6569b = this;
                                                                }

                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    int i18 = i17;
                                                                    ProfileViewerActivity profileViewerActivity = this.f6569b;
                                                                    switch (i18) {
                                                                        case 0:
                                                                            WebView webView6 = profileViewerActivity.L;
                                                                            if (webView6 == null) {
                                                                                jc.i.i("wb");
                                                                                throw null;
                                                                            }
                                                                            if (webView6.canGoBack()) {
                                                                                WebView webView7 = profileViewerActivity.L;
                                                                                if (webView7 != null) {
                                                                                    webView7.goBack();
                                                                                    return;
                                                                                } else {
                                                                                    jc.i.i("wb");
                                                                                    throw null;
                                                                                }
                                                                            }
                                                                            return;
                                                                        case 1:
                                                                            WebView webView8 = profileViewerActivity.L;
                                                                            if (webView8 == null) {
                                                                                jc.i.i("wb");
                                                                                throw null;
                                                                            }
                                                                            if (webView8.canGoForward()) {
                                                                                WebView webView9 = profileViewerActivity.L;
                                                                                if (webView9 != null) {
                                                                                    webView9.goForward();
                                                                                    return;
                                                                                } else {
                                                                                    jc.i.i("wb");
                                                                                    throw null;
                                                                                }
                                                                            }
                                                                            return;
                                                                        case 2:
                                                                            WebView webView10 = profileViewerActivity.L;
                                                                            if (webView10 != null) {
                                                                                webView10.reload();
                                                                                return;
                                                                            } else {
                                                                                jc.i.i("wb");
                                                                                throw null;
                                                                            }
                                                                        case 3:
                                                                            ConcurrentHashMap concurrentHashMap = ProfileViewerActivity.P;
                                                                            profileViewerActivity.v();
                                                                            return;
                                                                        default:
                                                                            ConcurrentHashMap concurrentHashMap2 = ProfileViewerActivity.P;
                                                                            profileViewerActivity.u();
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            P.put(Long.valueOf(this.M), this);
                                                            T.remove(Long.valueOf(this.M));
                                                            Log.i(str, "viewer '#" + this.M + "' instancia=" + System.identityHashCode(this) + " REGISTRADA en alive");
                                                            Q.put(Long.valueOf(this.M), stringExtra2);
                                                            x();
                                                            return;
                                                        }
                                                        i10 = R.id.wv_profile;
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // g.g, androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        String str;
        ViewGroup viewGroup;
        Long lValueOf = Long.valueOf(this.M);
        ConcurrentHashMap concurrentHashMap = P;
        Activity activity = (Activity) concurrentHashMap.get(lValueOf);
        boolean z4 = (activity == null || activity == this) ? false : true;
        StringBuilder sb2 = new StringBuilder("viewer.onDestroy '#");
        sb2.append(this.M);
        sb2.append("' instancia=");
        sb2.append(System.identityHashCode(this));
        sb2.append(" minimized=");
        sb2.append(this.N);
        sb2.append(" isFinishing=");
        sb2.append(isFinishing());
        sb2.append(" alive[pid]=");
        if (activity == null) {
            str = "null";
        } else if (activity == this) {
            str = "YO";
        } else {
            str = "OTRA(" + System.identityHashCode(activity) + ')';
        }
        sb2.append(str);
        sb2.append(" → ");
        sb2.append(z4 ? "RELEVADO (limpieza mínima)" : "DUEÑO (limpieza total)");
        Log.i("KRYPT-PROXY", sb2.toString());
        if (z4) {
            Log.i("KRYPT-PROXY", "viewer #" + this.M + " RELEVADO por una ventana nueva → limpieza mínima (ruta y frasco intactos)");
            WebView webView = this.L;
            if (webView == null) {
                i.i("wb");
                throw null;
            }
            webView.stopLoading();
            ViewParent parent = webView.getParent();
            viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(webView);
            }
            webView.destroy();
            super.onDestroy();
            return;
        }
        concurrentHashMap.remove(Long.valueOf(this.M));
        Q.remove(Long.valueOf(this.M));
        if (this.N) {
            Log.i("KRYPT-PROXY", "viewer.onDestroy #" + this.M + " (minimizado) → WebView en holder, ruta y frasco INTACTOS");
            super.onDestroy();
            return;
        }
        Log.i("KRYPT-PROXY", "viewer #" + this.M + " destruido → closeProfile");
        n3.i.f7270a.c(this.M);
        WebView webView2 = this.L;
        if (webView2 == null) {
            i.i("wb");
            throw null;
        }
        webView2.stopLoading();
        ViewParent parent2 = webView2.getParent();
        viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (viewGroup != null) {
            viewGroup.removeView(webView2);
        }
        webView2.destroy();
        String str2 = this.O;
        if (!this.N && isFinishing() && str2 != null) {
            boolean zJ = n9.b.j(this.M);
            if (!zJ) {
                n9.b.e(this.M);
            }
            StringBuilder sb3 = new StringBuilder("✕ perfil #");
            sb3.append(this.M);
            sb3.append(" → frasco '");
            sb3.append(str2);
            sb3.append("' ");
            sb3.append(zJ ? "ELIMINADO (cero rastros)" : "no se pudo eliminar → limpiado en sitio");
            Log.i("KRYPT-PROXY", sb3.toString());
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.w, androidx.activity.m, android.app.Activity
    public final void onNewIntent(Intent intent) {
        i.e(intent, "intent");
        super.onNewIntent(intent);
        String stringExtra = intent.getStringExtra("profile_url");
        if (stringExtra != null) {
            Long lValueOf = Long.valueOf(this.M);
            ConcurrentHashMap concurrentHashMap = Q;
            if (stringExtra.equals(concurrentHashMap.get(lValueOf))) {
                return;
            }
            concurrentHashMap.put(Long.valueOf(this.M), stringExtra);
            WebView webView = this.L;
            if (webView == null) {
                i.i("wb");
                throw null;
            }
            String title = webView.getTitle();
            j jVar = this.K;
            if (jVar == null) {
                i.i("vb");
                throw null;
            }
            TextView textView = (TextView) jVar.f1476k;
            if (title == null || pc.g.m0(title)) {
                title = w(stringExtra);
            }
            textView.setText(title);
        }
    }

    public final void u() {
        Log.i("KRYPT-PROXY", "viewer #" + this.M + " ✕ → cierre (wipe=siempre)");
        this.N = false;
        n3.i.f7270a.c(this.M);
        P.remove(Long.valueOf(this.M));
        T.remove(Long.valueOf(this.M));
        Toast.makeText(this, R.string.profile_traces_cleared, 0).show();
        finish();
    }

    public final void v() {
        Log.i("KRYPT-PROXY", "viewer #" + this.M + " minimizado — WebView entregado vivo");
        Toast.makeText(this, R.string.profile_minimized, 0).show();
        this.N = true;
        WebView webView = this.L;
        if (webView == null) {
            i.i("wb");
            throw null;
        }
        ViewParent parent = webView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            WebView webView2 = this.L;
            if (webView2 == null) {
                i.i("wb");
                throw null;
            }
            viewGroup.removeView(webView2);
        }
        Long lValueOf = Long.valueOf(this.M);
        WebView webView3 = this.L;
        if (webView3 == null) {
            i.i("wb");
            throw null;
        }
        R.put(lValueOf, webView3);
        S.put(Long.valueOf(this.M), Boolean.valueOf(this.O != null));
        P.remove(Long.valueOf(this.M));
        T.add(Long.valueOf(this.M));
        finish();
    }

    public final void x() {
        WebView webView = this.L;
        if (webView == null) {
            i.i("wb");
            throw null;
        }
        boolean zCanGoBack = webView.canGoBack();
        WebView webView2 = this.L;
        if (webView2 == null) {
            i.i("wb");
            throw null;
        }
        boolean zCanGoForward = webView2.canGoForward();
        j jVar = this.K;
        if (jVar == null) {
            i.i("vb");
            throw null;
        }
        ((ImageView) jVar.f1469a).setEnabled(zCanGoBack);
        j jVar2 = this.K;
        if (jVar2 == null) {
            i.i("vb");
            throw null;
        }
        ((ImageView) jVar2.f1469a).setAlpha(zCanGoBack ? 1.0f : 0.35f);
        j jVar3 = this.K;
        if (jVar3 == null) {
            i.i("vb");
            throw null;
        }
        ((ImageView) jVar3.f1471c).setEnabled(zCanGoForward);
        j jVar4 = this.K;
        if (jVar4 != null) {
            ((ImageView) jVar4.f1471c).setAlpha(zCanGoForward ? 1.0f : 0.35f);
        } else {
            i.i("vb");
            throw null;
        }
    }
}

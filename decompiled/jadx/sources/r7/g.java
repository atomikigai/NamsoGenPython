package r7;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.i0;
import androidx.fragment.app.s;
import androidx.fragment.app.w;
import androidx.webkit.ProfileStore;
import androidx.webkit.ProxyConfig;
import androidx.webkit.WebViewFeature;
import app.namso_gen.spacehowen.R;
import com.google.android.gms.internal.ads.zzbce;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzfet;
import com.google.android.gms.internal.ads.zzfwf;
import com.google.android.gms.internal.ads.zzfxd;
import com.google.android.gms.internal.p002firebaseauthapi.zzahf;
import com.google.android.gms.internal.p002firebaseauthapi.zzaia;
import d6.p;
import e6.t;
import h6.k0;
import h6.r0;
import java.io.Closeable;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import jc.q;
import l3.c0;
import l3.d0;
import l3.z;
import org.json.JSONException;
import org.json.JSONObject;
import pc.o;
import v9.a0;
import v9.x;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ClassLoader f8210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Thread f8211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static g.f f8212c;

    public static boolean B(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0129 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x012b  */
    public static void C(w wVar, Long l2, ic.l lVar) {
        if (wVar.isFinishing() || wVar.isDestroyed()) {
            return;
        }
        Object obj = null;
        View viewInflate = wVar.getLayoutInflater().inflate(R.layout.dialog_profile, (ViewGroup) null, false);
        int i = R.id.btn_pick_free_proxy;
        TextView textView = (TextView) o(viewInflate, R.id.btn_pick_free_proxy);
        if (textView != null) {
            i = R.id.btn_pick_premium_proxy;
            TextView textView2 = (TextView) o(viewInflate, R.id.btn_pick_premium_proxy);
            if (textView2 != null) {
                i = R.id.btn_pick_proxy;
                TextView textView3 = (TextView) o(viewInflate, R.id.btn_pick_proxy);
                if (textView3 != null) {
                    i = R.id.btn_remove_proxy;
                    TextView textView4 = (TextView) o(viewInflate, R.id.btn_remove_proxy);
                    if (textView4 != null) {
                        i = R.id.btn_save_only;
                        TextView textView5 = (TextView) o(viewInflate, R.id.btn_save_only);
                        if (textView5 != null) {
                            i = R.id.btn_save_open;
                            TextView textView6 = (TextView) o(viewInflate, R.id.btn_save_open);
                            if (textView6 != null) {
                                i = R.id.et_profile_name;
                                EditText editText = (EditText) o(viewInflate, R.id.et_profile_name);
                                if (editText != null) {
                                    i = R.id.et_profile_url;
                                    EditText editText2 = (EditText) o(viewInflate, R.id.et_profile_url);
                                    if (editText2 != null) {
                                        i = R.id.tv_profile_proxy;
                                        TextView textView7 = (TextView) o(viewInflate, R.id.tv_profile_proxy);
                                        if (textView7 != null) {
                                            ScrollView scrollView = (ScrollView) viewInflate;
                                            c3.j jVar = new c3.j(scrollView, textView, textView2, textView3, textView4, textView5, textView6, editText, editText2, textView7);
                                            ea.j jVar2 = new ea.j((Context) wVar, R.style.KryptProxyDialog);
                                            jVar2.l(l2 == null ? R.string.profiles_new_title : R.string.profiles_edit);
                                            ((g.b) jVar2.f3530b).f3983s = scrollView;
                                            jVar2.g(R.string.cancel, null);
                                            g.f fVarA = jVar2.a();
                                            q qVar = new q();
                                            n3.b bVarE = l2 != null ? p3.a.e(l2.longValue()) : null;
                                            if (bVarE != null) {
                                                int i10 = bVarE.f7242f;
                                                String str = bVarE.e;
                                                if (!pc.g.m0(str) && 1 <= i10 && i10 < 65536) {
                                                    editText.setText(bVarE.f7239b);
                                                    editText2.setText(bVarE.f7240c);
                                                    for (Object obj2 : qd.b.u()) {
                                                        n3.c cVar = (n3.c) obj2;
                                                        if (jc.i.a(cVar.f7247b, str) && cVar.f7248c == i10) {
                                                            obj = obj2;
                                                            break;
                                                        }
                                                    }
                                                    n3.c cVar2 = (n3.c) obj;
                                                    if (cVar2 == null) {
                                                        cVar2 = new n3.c(bVarE.f7241d, bVarE.f7242f, 512, bVarE.e, bVarE.f7243g, bVarE.h, bVarE.i, bVarE.f7244j, (String) null, bVarE.f7245k);
                                                    }
                                                    qVar.f5776a = cVar2;
                                                } else if (bVarE != null) {
                                                    editText.setText(bVarE.f7239b);
                                                    editText2.setText(bVarE.f7240c);
                                                }
                                            } else if (bVarE != null) {
                                                editText.setText(bVarE.f7239b);
                                                editText2.setText(bVarE.f7240c);
                                            }
                                            E(qVar, jVar, wVar);
                                            ((TextView) jVar.f1762d).setOnClickListener(new z(qVar, jVar, wVar));
                                            ((TextView) jVar.f1759a).setOnClickListener(new z(1, wVar, jVar, qVar));
                                            ((TextView) jVar.f1760b).setOnClickListener(new z(2, wVar, jVar, qVar));
                                            ((TextView) jVar.f1761c).setOnClickListener(new c0(wVar, qVar, fVarA, jVar));
                                            ((TextView) jVar.e).setOnClickListener(new d0(bVarE, wVar, jVar, fVarA, lVar, qVar, 0));
                                            ((TextView) jVar.f1763f).setOnClickListener(new d0(bVarE, wVar, jVar, fVarA, lVar, qVar, 1));
                                            fVarA.show();
                                            return;
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

    /* JADX WARN: Code duplicated, block: B:42:0x0133  */
    /* JADX WARN: Code duplicated, block: B:43:0x0139 A[Catch: all -> 0x0162, TRY_LEAVE, TryCatch #0 {all -> 0x0162, blocks: (B:40:0x012d, B:43:0x0139), top: B:98:0x012d }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0171  */
    /* JADX WARN: Code duplicated, block: B:62:0x017e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0185  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:73:0x0224  */
    /* JADX WARN: Code duplicated, block: B:74:0x0227  */
    /* JADX WARN: Code duplicated, block: B:98:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static final void D(w wVar, n3.b bVar, c3.j jVar, q qVar, ic.l lVar) throws JSONException {
        n3.b bVar2;
        long j4;
        n3.b bVar3;
        long j10;
        n3.b bVar4;
        Object next;
        String str;
        boolean z4;
        String str2;
        Object objM;
        Object obj;
        boolean zBooleanValue;
        boolean zJ;
        boolean zE;
        boolean z10;
        boolean z11;
        long jCurrentTimeMillis = bVar != null ? bVar.f7238a : System.currentTimeMillis();
        String string = pc.g.B0(((EditText) jVar.f1764g).getText().toString()).toString();
        String string2 = pc.g.B0(((EditText) jVar.h).getText().toString()).toString();
        Object obj2 = qVar.f5776a;
        if (obj2 != null) {
            int i = ((n3.c) obj2).f7246a;
            jc.i.b(obj2);
            String str3 = ((n3.c) obj2).f7247b;
            Object obj3 = qVar.f5776a;
            jc.i.b(obj3);
            int i10 = ((n3.c) obj3).f7248c;
            Object obj4 = qVar.f5776a;
            jc.i.b(obj4);
            String str4 = ((n3.c) obj4).f7249d;
            Object obj5 = qVar.f5776a;
            jc.i.b(obj5);
            String str5 = ((n3.c) obj5).e;
            Object obj6 = qVar.f5776a;
            jc.i.b(obj6);
            String str6 = ((n3.c) obj6).f7250f;
            Object obj7 = qVar.f5776a;
            jc.i.b(obj7);
            String str7 = ((n3.c) obj7).f7251g;
            Object obj8 = qVar.f5776a;
            jc.i.b(obj8);
            bVar2 = new n3.b(jCurrentTimeMillis, string, string2, i, str3, i10, str4, str5, str6, str7, ((n3.c) obj8).i);
        } else {
            bVar2 = new n3.b(jCurrentTimeMillis, string, string2, 0, "", 0, "", "", null, null, false);
        }
        ArrayList arrayList = new ArrayList(p3.a.n());
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            j4 = bVar2.f7238a;
            if (i12 >= size) {
                i11 = -1;
                break;
            }
            Object obj9 = arrayList.get(i12);
            i12++;
            if (((n3.b) obj9).f7238a == j4) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            arrayList.set(i11, bVar2);
        } else {
            arrayList.add(bVar2);
        }
        p3.a.q(arrayList);
        String str8 = bVar2.f7240c;
        String str9 = bVar2.f7243g;
        int i13 = bVar2.f7242f;
        String str10 = bVar2.e;
        int i14 = bVar2.f7241d;
        if (bVar != null) {
            String str11 = bVar.f7240c;
            String str12 = bVar.f7243g;
            int i15 = bVar.f7242f;
            String str13 = bVar.e;
            int i16 = bVar.f7241d;
            if (i16 == i14 && jc.i.a(str13, str10) && i15 == i13 && jc.i.a(str12, str9)) {
                str = str12;
                if (jc.i.a(bVar.h, bVar2.h) && jc.i.a(str11, str8)) {
                    z4 = false;
                }
                if (z4) {
                    try {
                        if (WebViewFeature.isFeatureSupported(WebViewFeature.MULTI_PROFILE)) {
                            str2 = str9;
                            try {
                                bVar3 = bVar2;
                                try {
                                    objM = Boolean.valueOf(ProfileStore.getInstance().getAllProfileNames().contains("krypt_p_" + jCurrentTimeMillis));
                                } catch (Throwable th) {
                                    th = th;
                                    objM = m(th);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                bVar3 = bVar2;
                            }
                            obj = Boolean.FALSE;
                            if (objM instanceof ub.g) {
                                objM = obj;
                            }
                            zBooleanValue = ((Boolean) objM).booleanValue();
                        } else {
                            bVar3 = bVar2;
                            str2 = str9;
                            zBooleanValue = false;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        bVar3 = bVar2;
                        str2 = str9;
                    }
                    zJ = n9.b.j(jCurrentTimeMillis);
                    if (zJ) {
                        zE = true;
                    } else {
                        zE = n9.b.e(jCurrentTimeMillis);
                    }
                    Log.i("KRYPT-PROXY", "perfil #" + jCurrentTimeMillis + " EDIT proxy → jarExistía=" + zBooleanValue + " jarIncinerado=" + zJ + " jarLimpiado=" + zE + " (multiProfile=" + WebViewFeature.isFeatureSupported(WebViewFeature.MULTI_PROFILE) + ')');
                } else {
                    bVar3 = bVar2;
                    str2 = str9;
                }
                StringBuilder sb2 = new StringBuilder("perfil #");
                j10 = j4;
                sb2.append(j10);
                sb2.append(" GUARDADO (edit) viejo=t=");
                sb2.append(i16);
                sb2.append(' ');
                sb2.append(str13);
                sb2.append(':');
                sb2.append(i15);
                sb2.append(" auth=");
                if (str.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                sb2.append(z10);
                sb2.append(" url=");
                sb2.append(str11);
                sb2.append(" → nuevo=t=");
                sb2.append(i14);
                sb2.append(' ');
                sb2.append(str10);
                sb2.append(':');
                sb2.append(i13);
                sb2.append(" auth=");
                if (str2.length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                sb2.append(z11);
                sb2.append(" url=");
                sb2.append(str8);
                sb2.append(" cambiado=");
                sb2.append(z4);
                sb2.append(" dominio='");
                sb2.append(bVar3.a());
                sb2.append('\'');
                Log.i("KRYPT-PROXY", sb2.toString());
            } else {
                str = str12;
            }
            z4 = true;
            if (z4) {
                if (WebViewFeature.isFeatureSupported(WebViewFeature.MULTI_PROFILE)) {
                    bVar3 = bVar2;
                    str2 = str9;
                    zBooleanValue = false;
                } else {
                    str2 = str9;
                    bVar3 = bVar2;
                    objM = Boolean.valueOf(ProfileStore.getInstance().getAllProfileNames().contains("krypt_p_" + jCurrentTimeMillis));
                    obj = Boolean.FALSE;
                    if (objM instanceof ub.g) {
                        objM = obj;
                    }
                    zBooleanValue = ((Boolean) objM).booleanValue();
                }
                zJ = n9.b.j(jCurrentTimeMillis);
                if (zJ) {
                    zE = n9.b.e(jCurrentTimeMillis);
                } else {
                    zE = true;
                }
                Log.i("KRYPT-PROXY", "perfil #" + jCurrentTimeMillis + " EDIT proxy → jarExistía=" + zBooleanValue + " jarIncinerado=" + zJ + " jarLimpiado=" + zE + " (multiProfile=" + WebViewFeature.isFeatureSupported(WebViewFeature.MULTI_PROFILE) + ')');
            } else {
                bVar3 = bVar2;
                str2 = str9;
            }
            StringBuilder sb3 = new StringBuilder("perfil #");
            j10 = j4;
            sb3.append(j10);
            sb3.append(" GUARDADO (edit) viejo=t=");
            sb3.append(i16);
            sb3.append(' ');
            sb3.append(str13);
            sb3.append(':');
            sb3.append(i15);
            sb3.append(" auth=");
            if (str.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            sb3.append(z10);
            sb3.append(" url=");
            sb3.append(str11);
            sb3.append(" → nuevo=t=");
            sb3.append(i14);
            sb3.append(' ');
            sb3.append(str10);
            sb3.append(':');
            sb3.append(i13);
            sb3.append(" auth=");
            if (str2.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            sb3.append(z11);
            sb3.append(" url=");
            sb3.append(str8);
            sb3.append(" cambiado=");
            sb3.append(z4);
            sb3.append(" dominio='");
            sb3.append(bVar3.a());
            sb3.append('\'');
            Log.i("KRYPT-PROXY", sb3.toString());
        } else {
            bVar3 = bVar2;
            j10 = j4;
            StringBuilder sb4 = new StringBuilder("perfil #");
            sb4.append(j10);
            sb4.append(" CREADO t=");
            sb4.append(i14);
            sb4.append(' ');
            sb4.append(str10);
            sb4.append(':');
            sb4.append(i13);
            sb4.append(" auth=");
            sb4.append(str9.length() > 0);
            sb4.append(" url=");
            sb4.append(str8);
            sb4.append(" dominio='");
            sb4.append(bVar3.a());
            sb4.append('\'');
            Log.i("KRYPT-PROXY", sb4.toString());
        }
        Iterator it = p3.a.n().iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar4 = bVar3;
                next = null;
                break;
            }
            next = it.next();
            n3.b bVar5 = (n3.b) next;
            if (bVar5.f7238a != j10) {
                bVar4 = bVar3;
                if (bVar5.c(bVar4)) {
                    break;
                }
            } else {
                bVar4 = bVar3;
            }
            bVar3 = bVar4;
        }
        n3.b bVar6 = (n3.b) next;
        if (bVar6 == null) {
            lVar.invoke(bVar4);
            return;
        }
        ea.j jVar2 = new ea.j((Context) wVar, R.style.KryptProxyDialog);
        jVar2.l(R.string.profiles_dupe_warn_title);
        ((g.b) jVar2.f3530b).f3972f = wVar.getString(R.string.profiles_dupe_warn_msg, bVar6.f7239b);
        jVar2.j(R.string.profiles_save_anyway, new h3.e(3, lVar, bVar4));
        jVar2.g(R.string.cancel, null);
        jVar2.m();
    }

    public static final void E(q qVar, c3.j jVar, Activity activity) {
        String str;
        String str2;
        n3.c cVar = (n3.c) qVar.f5776a;
        if (cVar == null) {
            ((TextView) jVar.i).setText(activity.getString(R.string.profile_no_proxy));
            ((TextView) jVar.f1762d).setVisibility(8);
            return;
        }
        String str3 = cVar.f7247b;
        ((TextView) jVar.f1762d).setVisibility(0);
        int i = cVar.f7246a;
        if (i == 1) {
            str = "HTTPS";
        } else if (i != 2) {
            str = i != 3 ? "HTTP" : "SOCKS4";
        } else {
            str = "SOCKS5";
        }
        pc.f fVar = n3.d.f7253a;
        String strE = n3.d.e(cVar.f7250f);
        boolean zF0 = pc.g.f0(str3, "proxiware", true);
        TextView textView = (TextView) jVar.i;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(n3.d.d(cVar));
        if (cVar.i && strE.length() > 0) {
            sb2.append(' ');
            sb2.append(strE);
            sb2.append(" · ");
        } else if (!cVar.i && (str2 = cVar.h) != null) {
            String strE2 = n3.d.e(str2);
            if (strE2.length() > 0) {
                sb2.append(' ');
                sb2.append(strE2);
                sb2.append(' ');
                sb2.append(activity.getString(R.string.proxy_country_claimed));
                sb2.append(" · ");
            }
        }
        if (zF0) {
            sb2.append(activity.getString(R.string.proxy_residential_label));
        } else {
            sb2.append(str3 + ':' + cVar.f7248c + " · ");
            sb2.append(str);
        }
        textView.setText(sb2.toString());
    }

    public static final boolean F(n3.b bVar, w wVar, c3.j jVar) {
        String host;
        EditText editText = (EditText) jVar.f1764g;
        String lowerCase = null;
        if (bVar == null && !wVar.getSharedPreferences("app_settings", 0).getBoolean("is_premium_cached", false) && p3.a.n().size() >= 2) {
            Toast.makeText(wVar, R.string.sub_limit_profiles_toast, 0).show();
            i0 i0VarP = wVar.p();
            jc.i.d(i0VarP, "getSupportFragmentManager(...)");
            s sVarY = i0VarP.y("SubscriptionDialog");
            m3.b bVar2 = sVarY instanceof m3.b ? (m3.b) sVarY : null;
            if (bVar2 != null && bVar2.y()) {
                return false;
            }
            m3.b bVar3 = new m3.b();
            Bundle bundle = new Bundle();
            bundle.putString("arg_reason", "profiles_limit");
            bVar3.Y(bundle);
            bVar3.e0(i0VarP, "SubscriptionDialog");
            return false;
        }
        EditText editText2 = (EditText) jVar.h;
        if (pc.g.B0(editText.getText().toString()).toString().length() == 0) {
            editText.setError(wVar.getString(R.string.profile_bad_name));
            return false;
        }
        String string = pc.g.B0(editText2.getText().toString()).toString();
        Uri uri = Uri.parse(string);
        String scheme = uri.getScheme();
        if (scheme != null) {
            lowerCase = scheme.toLowerCase(Locale.ROOT);
            jc.i.d(lowerCase, "toLowerCase(...)");
        }
        if (string.length() != 0 && ((jc.i.a(lowerCase, ProxyConfig.MATCH_HTTP) || jc.i.a(lowerCase, ProxyConfig.MATCH_HTTPS)) && (host = uri.getHost()) != null && !pc.g.m0(host))) {
            return true;
        }
        editText2.setError(wVar.getString(R.string.profile_bad_url));
        return false;
    }

    public static final void G(Object obj) {
        if (obj instanceof ub.g) {
            throw ((ub.g) obj).f9067a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00ab A[Catch: all -> 0x00a7, PHI: r1
      0x00ab: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v15 java.lang.Thread) binds: [B:7:0x000a, B:47:0x00a4] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:46:0x00a2, B:61:0x00d1, B:12:0x001f, B:52:0x00aa, B:53:0x00ab, B:64:0x00d5, B:65:0x00d6, B:54:0x00ac, B:60:0x00d0, B:59:0x00b6, B:13:0x0020, B:15:0x002d, B:25:0x0047, B:26:0x004e, B:28:0x0059, B:34:0x006e, B:35:0x0075, B:43:0x0086, B:44:0x00a0, B:18:0x003c), top: B:77:0x0003, inners: #2, #6 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static synchronized ClassLoader I() {
        SecurityException e;
        Thread thread;
        ThreadGroup threadGroup;
        if (f8210a == null) {
            Thread thread2 = f8211b;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = f8211b.getContextClassLoader();
                    } catch (SecurityException e4) {
                        Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e4.getMessage());
                    }
                }
                f8210a = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i = 0;
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i10];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i10++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i++;
                                }
                                if (thread == null) {
                                    try {
                                        od.b bVar = new od.b(threadGroup, "GmsDynamite");
                                        try {
                                            bVar.setContextClassLoader(null);
                                            bVar.start();
                                            thread = bVar;
                                        } catch (SecurityException e10) {
                                            e = e10;
                                            thread = bVar;
                                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e.getMessage());
                                        }
                                    } catch (SecurityException e11) {
                                        e = e11;
                                    }
                                }
                            } catch (SecurityException e12) {
                                e = e12;
                                thread = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    thread2 = thread;
                }
                f8211b = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = f8211b.getContextClassLoader();
                    }
                }
                f8210a = contextClassLoader;
            }
        }
        return f8210a;
    }

    public static v9.s J(zzahf zzahfVar) {
        if (zzahfVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzahfVar.zzf())) {
            String strZze = zzahfVar.zze();
            String strZzd = zzahfVar.zzd();
            long jZza = zzahfVar.zza();
            String strZzf = zzahfVar.zzf();
            com.google.android.gms.common.internal.i0.e(strZzf);
            return new x(jZza, strZze, strZzd, strZzf);
        }
        if (zzahfVar.zzc() == null) {
            return null;
        }
        String strZze2 = zzahfVar.zze();
        String strZzd2 = zzahfVar.zzd();
        long jZza2 = zzahfVar.zza();
        zzaia zzaiaVarZzc = zzahfVar.zzc();
        com.google.android.gms.common.internal.i0.j(zzaiaVarZzc, "totpInfo cannot be null.");
        return new a0(strZze2, strZzd2, jZza2, zzaiaVarZzc);
    }

    public static WindowManager.LayoutParams K() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) t.f3437d.f3440c.zza(zzbcn.zzhI)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static ArrayList L(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v9.s sVarJ = J((zzahf) it.next());
            if (sVarJ != null) {
                arrayList.add(sVarJ);
            }
        }
        return arrayList;
    }

    public static JSONObject M(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    int i = point2.x;
                    e6.s sVar = e6.s.f3427f;
                    jSONObject3.put("x", sVar.f3428a.f(context, i));
                    jSONObject3.put("y", sVar.f3428a.f(context, point2.y));
                    jSONObject3.put("start_x", sVar.f3428a.f(context, point.x));
                    jSONObject3.put("start_y", sVar.f3428a.f(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException e) {
                    i6.h.e("Error occurred while putting signals into JSON object.", e);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e4) {
                e = e4;
                jSONObject = jSONObject2;
                i6.h.e("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    public static JSONObject N(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) {
        int[] iArr;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int i = 2;
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] iArr3 = new int[i];
                    view2.getLocationOnScreen(iArr3);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    Iterator it2 = it;
                    try {
                        int measuredWidth = view2.getMeasuredWidth();
                        iArr = iArr2;
                        try {
                            e6.s sVar = e6.s.f3427f;
                            jSONObject4.put("width", sVar.f3428a.f(context, measuredWidth));
                            jSONObject4.put("height", sVar.f3428a.f(context, view2.getMeasuredHeight()));
                            jSONObject4.put("x", sVar.f3428a.f(context, iArr3[0] - iArr[0]));
                            jSONObject4.put("y", sVar.f3428a.f(context, iArr3[1] - iArr[1]));
                            jSONObject4.put("relative_to", "ad_view");
                            jSONObject3.put("frame", jSONObject4);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject = T(context, rect);
                            } else {
                                jSONObject = new JSONObject();
                                jSONObject.put("width", 0);
                                jSONObject.put("height", 0);
                                jSONObject.put("x", sVar.f3428a.f(context, iArr3[0] - iArr[0]));
                                jSONObject.put("y", sVar.f3428a.f(context, iArr3[1] - iArr[1]));
                                jSONObject.put("relative_to", "ad_view");
                            }
                            jSONObject3.put("visible_bounds", jSONObject);
                            if (((String) entry.getKey()).equals("3010")) {
                                zzbce zzbceVar = zzbcn.zzhD;
                                t tVar = t.f3437d;
                                if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                                    jSONObject3.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) tVar.f3440c.zza(zzbcn.zzhE)).booleanValue()) {
                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                    jSONObject3.put("view_width_layout_type", U(layoutParams.width) - 1);
                                    jSONObject3.put("view_height_layout_type", U(layoutParams.height) - 1);
                                }
                                if (((Boolean) tVar.f3440c.zza(zzbcn.zzhF)).booleanValue()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(view2.getId()));
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        arrayList.add(Integer.valueOf(((View) parent).getId()));
                                    }
                                    jSONObject3.put("view_path", TextUtils.join("/", arrayList));
                                }
                                if (scaleType != null) {
                                    jSONObject3.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof TextView) {
                                TextView textView = (TextView) view2;
                                jSONObject3.put("text_color", textView.getCurrentTextColor());
                                jSONObject3.put("font_size", textView.getTextSize());
                                jSONObject3.put("text", textView.getText());
                            }
                            jSONObject3.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                            jSONObject2.put((String) entry.getKey(), jSONObject3);
                        } catch (JSONException unused) {
                            i6.h.g("Unable to get asset views information");
                        }
                    } catch (JSONException unused2) {
                        iArr = iArr2;
                    }
                    it = it2;
                    iArr2 = iArr;
                    i = 2;
                }
            }
        }
        return jSONObject2;
    }

    public static JSONObject O(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                r0 r0Var = p.C.f2979c;
                jSONObject.put("can_show_on_lock_screen", r0.C(view));
                boolean z4 = false;
                if (context != null) {
                    Object systemService = context.getSystemService("keyguard");
                    KeyguardManager keyguardManager = (systemService == null || !(systemService instanceof KeyguardManager)) ? null : (KeyguardManager) systemService;
                    if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
                        z4 = true;
                    }
                }
                jSONObject.put("is_keyguard_locked", z4);
                return jSONObject;
            } catch (JSONException unused) {
                i6.h.g("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static JSONObject P(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                boolean z4 = true;
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzhC)).booleanValue()) {
                    r0 r0Var = p.C.f2979c;
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof ScrollView)) {
                        parent = parent.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", parent != null);
                    return jSONObject;
                }
                r0 r0Var2 = p.C.f2979c;
                ViewParent parent2 = view.getParent();
                while (parent2 != null && !(parent2 instanceof AdapterView)) {
                    parent2 = parent2.getParent();
                }
                if ((parent2 == null ? -1 : ((AdapterView) parent2).getPositionForView(view)) == -1) {
                    z4 = false;
                }
                jSONObject.put("contained_in_scroll_view", z4);
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0111  */
    /* JADX WARN: Code duplicated, block: B:34:0x011e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0133  */
    /* JADX WARN: Code duplicated, block: B:46:0x013b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0141 A[Catch: JSONException -> 0x0131, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0131, blocks: (B:31:0x0113, B:40:0x012d, B:48:0x0141, B:47:0x013d), top: B:59:0x0113 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static JSONObject Q(Context context, View view) {
        int i;
        ViewParent parent;
        String str;
        int iHashCode;
        JSONObject jSONObjectT;
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            int i10 = 1;
            try {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int[] iArr2 = {view.getMeasuredWidth(), view.getMeasuredHeight()};
                ViewParent parent2 = view.getParent();
                while (parent2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent2;
                    i = i10;
                    try {
                        iArr2[0] = Math.min(viewGroup.getMeasuredWidth(), iArr2[0]);
                        iArr2[i] = Math.min(viewGroup.getMeasuredHeight(), iArr2[i]);
                        parent2 = parent2.getParent();
                        i10 = i;
                    } catch (Exception unused) {
                        i6.h.g("Unable to get native ad view bounding box");
                        parent = view.getParent();
                        if (parent != null) {
                            try {
                                str = (String) parent.getClass().getMethod("getTemplateTypeName", null).invoke(parent, null);
                            } catch (IllegalAccessException e) {
                                e = e;
                                i6.h.e("Cannot access method getTemplateTypeName: ", e);
                                str = "";
                            } catch (NoSuchMethodException unused2) {
                                str = "";
                            } catch (SecurityException e4) {
                                e = e4;
                                i6.h.e("Cannot access method getTemplateTypeName: ", e);
                                str = "";
                            } catch (InvocationTargetException e10) {
                                e = e10;
                                i6.h.e("Cannot access method getTemplateTypeName: ", e);
                                str = "";
                            }
                        } else {
                            str = "";
                        }
                        iHashCode = str.hashCode();
                        if (iHashCode != -2066603854) {
                            if (iHashCode != 2019754500) {
                                jSONObject.put("native_template_type", 0);
                            } else {
                                jSONObject.put("native_template_type", 2);
                            }
                        } else if (str.equals("small_template")) {
                            jSONObject.put("native_template_type", i);
                        } else {
                            jSONObject.put("native_template_type", 0);
                        }
                        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzhE)).booleanValue()) {
                            try {
                                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                jSONObject.put("view_width_layout_type", U(layoutParams.width) - 1);
                                jSONObject.put("view_height_layout_type", U(layoutParams.height) - 1);
                            } catch (Exception unused3) {
                                k0.k("Unable to get native ad view layout types");
                            }
                        }
                        return jSONObject;
                    }
                }
                i = i10;
                JSONObject jSONObject2 = new JSONObject();
                int measuredWidth = view.getMeasuredWidth();
                e6.s sVar = e6.s.f3427f;
                i6.d dVar = sVar.f3428a;
                i6.d dVar2 = sVar.f3428a;
                jSONObject2.put("width", dVar.f(context, measuredWidth));
                jSONObject2.put("height", dVar2.f(context, view.getMeasuredHeight()));
                jSONObject2.put("x", dVar2.f(context, iArr[0]));
                jSONObject2.put("y", dVar2.f(context, iArr[i]));
                jSONObject2.put("maximum_visible_width", dVar2.f(context, iArr2[0]));
                jSONObject2.put("maximum_visible_height", dVar2.f(context, iArr2[i]));
                jSONObject2.put("relative_to", "window");
                jSONObject.put("frame", jSONObject2);
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    jSONObjectT = T(context, rect);
                } else {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("width", 0);
                    jSONObject3.put("height", 0);
                    jSONObject3.put("x", dVar2.f(context, iArr[0]));
                    jSONObject3.put("y", dVar2.f(context, iArr[i]));
                    jSONObject3.put("relative_to", "window");
                    jSONObjectT = jSONObject3;
                }
                jSONObject.put("visible_bounds", jSONObjectT);
            } catch (Exception unused4) {
                i = i10;
            }
            parent = view.getParent();
            if (parent != null) {
                str = (String) parent.getClass().getMethod("getTemplateTypeName", null).invoke(parent, null);
            } else {
                str = "";
            }
            try {
                iHashCode = str.hashCode();
                if (iHashCode != -2066603854) {
                    if (iHashCode != 2019754500 && str.equals("medium_template")) {
                        jSONObject.put("native_template_type", 2);
                    } else {
                        jSONObject.put("native_template_type", 0);
                    }
                } else if (str.equals("small_template")) {
                    jSONObject.put("native_template_type", i);
                } else {
                    jSONObject.put("native_template_type", 0);
                }
            } catch (JSONException e11) {
                i6.h.e("Could not log native template signal to JSON", e11);
            }
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzhE)).booleanValue()) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                jSONObject.put("view_width_layout_type", U(layoutParams2.width) - 1);
                jSONObject.put("view_height_layout_type", U(layoutParams2.height) - 1);
            }
        }
        return jSONObject;
    }

    public static boolean R(Context context, zzfet zzfetVar) {
        if (!zzfetVar.zzN) {
            return false;
        }
        zzbce zzbceVar = zzbcn.zzhG;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            return ((Boolean) tVar.f3440c.zza(zzbcn.zzhJ)).booleanValue();
        }
        String str = (String) tVar.f3440c.zza(zzbcn.zzhH);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            Iterator it = zzfxd.zzb(zzfwf.zzc(';')).zzc(str).iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean S(int i) {
        zzbce zzbceVar = zzbcn.zzdA;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            return ((Boolean) tVar.f3440c.zza(zzbcn.zzdB)).booleanValue() || i <= 15299999;
        }
        return true;
    }

    public static JSONObject T(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        int i = rect.right - rect.left;
        e6.s sVar = e6.s.f3427f;
        jSONObject.put("width", sVar.f3428a.f(context, i));
        int i10 = rect.bottom - rect.top;
        i6.d dVar = sVar.f3428a;
        jSONObject.put("height", dVar.f(context, i10));
        jSONObject.put("x", dVar.f(context, rect.left));
        jSONObject.put("y", dVar.f(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    public static int U(int i) {
        if (i != -2) {
            return i != -1 ? 2 : 3;
        }
        return 4;
    }

    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final void h(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                p3.a.a(th, th2);
            }
        }
    }

    public static final int i(g2.c cVar, String str) {
        jc.i.e(cVar, "<this>");
        int iJ = j(cVar, str);
        if (iJ >= 0) {
            return iJ;
        }
        int iJ2 = j(cVar, "`" + str + '`');
        if (iJ2 >= 0) {
            return iJ2;
        }
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        int columnCount = cVar.getColumnCount();
        String strConcat = ".".concat(str);
        String str2 = "." + str + '`';
        for (int i = 0; i < columnCount; i++) {
            String columnName = cVar.getColumnName(i);
            if (columnName.length() >= str.length() + 2 && (o.Z(columnName, strConcat) || (columnName.charAt(0) == '`' && o.Z(columnName, str2)))) {
                return i;
            }
        }
        return -1;
    }

    public static final int j(g2.c cVar, String str) {
        jc.i.e(cVar, "<this>");
        jc.i.e(str, "name");
        int columnCount = cVar.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            if (str.equals(cVar.getColumnName(i))) {
                return i;
            }
        }
        return -1;
    }

    public static final long k(long j4, qc.c cVar, qc.c cVar2) {
        jc.i.e(cVar, "sourceUnit");
        jc.i.e(cVar2, "targetUnit");
        return cVar2.f8067a.convert(j4, cVar.f8067a);
    }

    public static x9.b l(String str, String str2) {
        ib.a aVar = new ib.a(str, str2);
        x9.a aVarA = x9.b.a(ib.a.class);
        aVarA.e = 1;
        aVarA.f10313f = new t4.f(aVar);
        return aVarA.b();
    }

    public static final ub.g m(Throwable th) {
        jc.i.e(th, "exception");
        return new ub.g(th);
    }

    public static com.google.android.gms.common.api.internal.o n(Looper looper, Object obj, String str) {
        com.google.android.gms.common.internal.i0.j(obj, "Listener must not be null");
        com.google.android.gms.common.internal.i0.j(looper, "Looper must not be null");
        com.google.android.gms.common.internal.i0.j(str, "Listener type must not be null");
        return new com.google.android.gms.common.api.internal.o(looper, obj, str);
    }

    public static View o(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View viewFindViewById = viewGroup.getChildAt(i10).findViewById(i);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    public static x9.b p(String str, lb.m mVar) {
        x9.a aVarA = x9.b.a(ib.a.class);
        aVarA.e = 1;
        aVarA.a(x9.i.b(Context.class));
        aVarA.f10313f = new e5.c(str, mVar, 13);
        return aVarA.b();
    }

    public static bd.q q(String str) {
        jc.i.e(str, "<this>");
        Matcher matcher = bd.q.f1632c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String strGroup = matcher.group(1);
        jc.i.d(strGroup, "typeSubtype.group(1)");
        Locale locale = Locale.US;
        jc.i.d(locale, "US");
        jc.i.d(strGroup.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        String strGroup2 = matcher.group(2);
        jc.i.d(strGroup2, "typeSubtype.group(2)");
        jc.i.d(strGroup2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = bd.q.f1633d.matcher(str);
        int iEnd = matcher.end();
        while (iEnd < str.length()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb2 = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(iEnd);
                jc.i.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring);
                sb2.append("\" for: \"");
                sb2.append(str);
                sb2.append('\"');
                throw new IllegalArgumentException(sb2.toString().toString());
            }
            String strGroup3 = matcher2.group(1);
            if (strGroup3 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null) {
                    strGroup4 = matcher2.group(3);
                } else if (o.e0(strGroup4, "'", false) && o.Z(strGroup4, "'") && strGroup4.length() > 2) {
                    strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                    jc.i.d(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(strGroup3);
                arrayList.add(strGroup4);
                iEnd = matcher2.end();
            }
        }
        return new bd.q(str, (String[]) arrayList.toArray(new String[0]));
    }

    public static final int r(g2.c cVar, String str) {
        jc.i.e(cVar, "stmt");
        int i = i(cVar, str);
        if (i >= 0) {
            return i;
        }
        int columnCount = cVar.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i10 = 0; i10 < columnCount; i10++) {
            arrayList.add(cVar.getColumnName(i10));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + vb.i.e0(arrayList, null, null, null, null, 63) + ']');
    }

    public static void u(String str, Bundle bundle) {
        try {
            n9.g.d();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e4) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e4);
                }
            }
            String str2 = e7.i.A(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            r9.b bVar = (r9.b) n9.g.d().b(r9.b.class);
            if (bVar != null) {
                ((r9.c) bVar).a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public abstract void A(t.f fVar, Thread thread);

    public abstract boolean H(View view, int i);

    public abstract boolean b(t.g gVar, t.c cVar, t.c cVar2);

    public abstract boolean c(t.g gVar, Object obj, Object obj2);

    public abstract boolean d(t.g gVar, t.f fVar, t.f fVar2);

    public abstract int e(View view, int i);

    public abstract int f(View view, int i);

    public abstract List g(String str, List list);

    public int s(View view) {
        return 0;
    }

    public int t() {
        return 0;
    }

    public abstract void w(int i);

    public abstract void x(View view, int i, int i10);

    public abstract void y(View view, float f10, float f11);

    public abstract void z(t.f fVar, t.f fVar2);

    public void v(View view, int i) {
    }
}

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.webkit.ProxyConfig;
import d6.b;
import d6.p;
import e6.s;
import e6.t;
import g6.e;
import h6.k0;
import h6.r0;
import i6.h;
import i6.k;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbkd implements zzbjr {
    private final b zza;
    private final zzdsm zzb;
    private final zzbse zzd;
    private final zzedp zze;
    private final zzcnb zzf;
    private g6.a zzg = null;
    private final zzges zzh = zzcaj.zzf;
    private final k zzc = new k(null);

    public zzbkd(b bVar, zzbse zzbseVar, zzedp zzedpVar, zzdsm zzdsmVar, zzcnb zzcnbVar) {
        this.zza = bVar;
        this.zzd = zzbseVar;
        this.zze = zzedpVar;
        this.zzb = zzdsmVar;
        this.zzf = zzcnbVar;
    }

    public static int zzb(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    public static Uri zzc(Context context, zzavc zzavcVar, Uri uri, View view, Activity activity, zzffs zzffsVar) {
        if (zzavcVar != null) {
            try {
                if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzlI)).booleanValue() || zzffsVar == null) {
                    if (zzavcVar.zze(uri)) {
                        return zzavcVar.zza(uri, context, view, activity);
                    }
                } else if (zzavcVar.zze(uri)) {
                    return zzffsVar.zza(uri, context, view, activity);
                }
            } catch (zzavd unused) {
            } catch (Exception e) {
                p.C.f2982g.zzw(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            }
        }
        return uri;
    }

    public static Uri zzd(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") == null) {
                return uri;
            }
            return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
        } catch (UnsupportedOperationException e) {
            h.e("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e);
            return uri;
        }
    }

    public static boolean zzf(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:116:0x02ce  */
    public final void zzh(String str, e6.a aVar, Map map, String str2) {
        String str3;
        boolean z4;
        String string;
        Map map2 = map;
        zzcfk zzcfkVar = (zzcfk) aVar;
        zzfet zzfetVarZzD = zzcfkVar.zzD();
        zzfew zzfewVarZzR = zzcfkVar.zzR();
        boolean zZzg = false;
        if (zzfetVarZzD == null || zzfewVarZzR == null) {
            str3 = "";
            z4 = false;
        } else {
            str3 = zzfewVarZzR.zzb;
            z4 = zzfetVarZzD.zzai;
        }
        zzbce zzbceVar = zzbcn.zzkr;
        t tVar = t.f3437d;
        zzbcl zzbclVar = tVar.f3440c;
        zzbcl zzbclVar2 = tVar.f3440c;
        boolean z10 = true;
        boolean z11 = (((Boolean) zzbclVar.zza(zzbceVar)).booleanValue() && map2.containsKey("sc") && ((String) map2.get("sc")).equals("0")) ? false : true;
        boolean z12 = ((Boolean) zzbclVar2.zza(zzbcn.zzmt)).booleanValue() && map2.containsKey("ig_cl") && ((String) map2.get("ig_cl")).equals("true");
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzcfkVar.zzaF()) {
                h.g("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzk(false);
                ((zzcgu) aVar).zzaL(zzf(map2), zzb(map2), z11);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            zzk(false);
            boolean z13 = ((Boolean) zzbclVar2.zza(zzbcn.zzlD)).booleanValue() && Objects.equals(map2.get("is_allowed_for_lock_screen"), "1");
            if (str != null) {
                ((zzcgu) aVar).zzaN(zzf(map2), zzb(map2), str, z11, z13);
                return;
            } else {
                ((zzcgu) aVar).zzaM(zzf(map2), zzb(map2), (String) map2.get("html"), (String) map2.get("baseurl"), z11);
                return;
            }
        }
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = zzcfkVar.getContext();
            if (((Boolean) zzbclVar2.zza(zzbcn.zzeH)).booleanValue()) {
                k0.k("User opt out chrome custom tab.");
                zzm(10);
            } else {
                if (!((Boolean) zzbclVar2.zza(zzbcn.zzeF)).booleanValue()) {
                    zZzg = zzbdo.zzg(context);
                } else if (o.h.a(context) != null) {
                    zZzg = true;
                }
                if (zZzg) {
                    zzk(true);
                    if (TextUtils.isEmpty(str)) {
                        h.g("Cannot open browser with null or empty url");
                        zzm(7);
                        return;
                    }
                    Uri uriZzd = zzd(zzc(zzcfkVar.getContext(), zzcfkVar.zzI(), Uri.parse(str), zzcfkVar.zzF(), zzcfkVar.zzi(), zzcfkVar.zzS()));
                    if (z4 && this.zze != null && zzl(aVar, zzcfkVar.getContext(), uriZzd.toString(), str3)) {
                        return;
                    }
                    this.zzg = new zzbka(this);
                    ((zzcgu) aVar).zzaJ(new e(null, uriZzd.toString(), null, null, null, null, null, null, new q7.b(this.zzg).asBinder(), true), z11, z12);
                    return;
                }
                zzm(4);
            }
            map2.put("use_first_package", "true");
            map2.put("use_running_process", "true");
            zzj(aVar, map2, z4, str3, z11, z12);
            return;
        }
        if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map2.get("system_browser"))) {
            zzj(aVar, map2, z4, str3, z11, z12);
            return;
        }
        boolean z14 = z11;
        boolean z15 = z4;
        e6.a aVar2 = aVar;
        boolean z16 = z12;
        String str4 = str3;
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) zzbclVar2.zza(zzbcn.zzhS)).booleanValue()) {
                zzk(true);
                String str5 = (String) map2.get("p");
                if (str5 == null) {
                    h.g("Package name missing from open app action.");
                    return;
                }
                if (z15 && this.zze != null && zzl(aVar2, zzcfkVar.getContext(), str5, str4)) {
                    return;
                }
                PackageManager packageManager = zzcfkVar.getContext().getPackageManager();
                if (packageManager == null) {
                    h.g("Cannot get package manager from open app action.");
                    return;
                }
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                if (launchIntentForPackage != null) {
                    ((zzcgu) aVar2).zzaJ(new e(launchIntentForPackage, this.zzg), z14, z16);
                    return;
                }
                return;
            }
            return;
        }
        zzk(true);
        String str6 = (String) map2.get("intent_url");
        Intent uri = null;
        if (!TextUtils.isEmpty(str6)) {
            try {
                uri = Intent.parseUri(str6, 0);
            } catch (URISyntaxException e) {
                h.e("Error parsing the url: ".concat(String.valueOf(str6)), e);
            }
        }
        if (uri != null && uri.getData() != null) {
            Uri data = uri.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri uriZzd2 = zzd(zzc(zzcfkVar.getContext(), zzcfkVar.zzI(), data, zzcfkVar.zzF(), zzcfkVar.zzi(), zzcfkVar.zzS()));
                if (TextUtils.isEmpty(uri.getType())) {
                    uri.setData(uriZzd2);
                } else {
                    if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzhT)).booleanValue()) {
                        uri.setDataAndType(uriZzd2, uri.getType());
                    } else {
                        uri.setData(uriZzd2);
                    }
                }
            }
        }
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzil)).booleanValue() || !"intent_async".equalsIgnoreCase(str2) || !map2.containsKey("event_id")) {
            z10 = false;
        }
        HashMap map3 = new HashMap();
        if (z10) {
            zzbkb zzbkbVar = new zzbkb(this, z14, aVar2, map3, map2);
            aVar2 = aVar2;
            map2 = map2;
            this.zzg = zzbkbVar;
        } else {
            zZzg = r4;
        }
        if (uri != null) {
            if (!z15 || this.zze == null || !zzl(aVar2, zzcfkVar.getContext(), uri.getData().toString(), str4)) {
                ((zzcgu) aVar2).zzaJ(new e(uri, this.zzg), zZzg, z16);
                return;
            } else {
                if (z10) {
                    map3.put((String) map2.get("event_id"), Boolean.TRUE);
                    ((zzbmm) aVar2).zzd("openIntentAsync", map3);
                    return;
                }
                return;
            }
        }
        if (TextUtils.isEmpty(str)) {
            string = str;
        } else {
            string = zzd(zzc(zzcfkVar.getContext(), zzcfkVar.zzI(), Uri.parse(str), zzcfkVar.zzF(), zzcfkVar.zzi(), zzcfkVar.zzS())).toString();
        }
        if (!z15 || this.zze == null || !zzl(aVar2, zzcfkVar.getContext(), string, str4)) {
            ((zzcgu) aVar2).zzaJ(new e((String) map2.get("i"), string, (String) map2.get("m"), (String) map2.get("p"), (String) map2.get("c"), (String) map2.get("f"), (String) map2.get("e"), this.zzg), zZzg, z16);
        } else if (z10) {
            map3.put((String) map2.get("event_id"), Boolean.TRUE);
            ((zzbmm) aVar2).zzd("openIntentAsync", map3);
        }
    }

    private final void zzi(Context context, String str, String str2) {
        this.zze.zzc(str);
        zzdsm zzdsmVar = this.zzb;
        if (zzdsmVar != null) {
            zzeea.zzd(context, zzdsmVar, this.zze, str, "dialog_not_shown", zzfzr.zze("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:46:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0145  */
    /* JADX WARN: Code duplicated, block: B:48:0x0152  */
    private final void zzj(e6.a aVar, Map map, boolean z4, String str, boolean z10, boolean z11) {
        Uri uriBuild;
        Intent intentZzb;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo resolveInfoZzc;
        boolean z12 = true;
        zzk(true);
        zzcfk zzcfkVar = (zzcfk) aVar;
        Context context = zzcfkVar.getContext();
        zzavc zzavcVarZzI = zzcfkVar.zzI();
        View viewZzF = zzcfkVar.zzF();
        zzffs zzffsVarZzS = zzcfkVar.zzS();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        if (TextUtils.isEmpty(str2)) {
            intentZzb = null;
        } else {
            Uri uriZzd = zzd(zzc(context, zzavcVarZzI, Uri.parse(str2), viewZzF, null, zzffsVarZzS));
            boolean z13 = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean z14 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzeB)).booleanValue()) {
                    z12 = false;
                }
            }
            if (ProxyConfig.MATCH_HTTP.equalsIgnoreCase(uriZzd.getScheme())) {
                uriBuild = uriZzd.buildUpon().scheme(ProxyConfig.MATCH_HTTPS).build();
            } else {
                uriBuild = ProxyConfig.MATCH_HTTPS.equalsIgnoreCase(uriZzd.getScheme()) ? uriZzd.buildUpon().scheme(ProxyConfig.MATCH_HTTP).build() : null;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentZza = zzbkc.zza(uriZzd, context, zzavcVarZzI, viewZzF, zzffsVarZzS);
            Intent intentZza2 = zzbkc.zza(uriBuild, context, zzavcVarZzI, viewZzF, zzffsVarZzS);
            if (z12) {
                p pVar = p.C;
                r0 r0Var = pVar.f2979c;
                r0.D(context, intentZza);
                r0 r0Var2 = pVar.f2979c;
                r0.D(context, intentZza2);
            }
            ResolveInfo resolveInfoZzd = zzbkc.zzd(intentZza, arrayList, context, zzavcVarZzI, viewZzF, zzffsVarZzS);
            if (resolveInfoZzd != null) {
                intentZzb = zzbkc.zzb(intentZza, resolveInfoZzd, context, zzavcVarZzI, viewZzF, zzffsVarZzS);
            } else if (intentZza2 != null && (resolveInfoZzc = zzbkc.zzc(intentZza2, context, zzavcVarZzI, viewZzF, zzffsVarZzS)) != null) {
                intentZzb = zzbkc.zzb(intentZza, resolveInfoZzc, context, zzavcVarZzI, viewZzF, zzffsVarZzS);
                if (zzbkc.zzc(intentZzb, context, zzavcVarZzI, viewZzF, zzffsVarZzS) == null) {
                    if (!arrayList.isEmpty()) {
                        intentZzb = intentZza;
                    } else if (!z14) {
                        if (z13) {
                            intentZzb = zzbkc.zzb(intentZza, (ResolveInfo) arrayList.get(0), context, zzavcVarZzI, viewZzF, zzffsVarZzS);
                        } else {
                            intentZzb = intentZza;
                        }
                    } else if (z13) {
                        intentZzb = zzbkc.zzb(intentZza, (ResolveInfo) arrayList.get(0), context, zzavcVarZzI, viewZzF, zzffsVarZzS);
                    } else {
                        intentZzb = intentZza;
                    }
                }
            } else if (!arrayList.isEmpty()) {
                intentZzb = intentZza;
            } else if (!z14 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i);
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            int i10 = i + 1;
                            if (it.hasNext()) {
                                List<ActivityManager.RunningAppProcessInfo> list = runningAppProcesses;
                                if (it.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                                    intentZzb = zzbkc.zzb(intentZza, resolveInfo, context, zzavcVarZzI, viewZzF, zzffsVarZzS);
                                } else {
                                    runningAppProcesses = list;
                                }
                            } else {
                                i = i10;
                            }
                        }
                    } else if (z13) {
                        intentZzb = zzbkc.zzb(intentZza, (ResolveInfo) arrayList.get(0), context, zzavcVarZzI, viewZzF, zzffsVarZzS);
                    } else {
                        intentZzb = intentZza;
                    }
                }
            } else if (z13) {
                intentZzb = zzbkc.zzb(intentZza, (ResolveInfo) arrayList.get(0), context, zzavcVarZzI, viewZzF, zzffsVarZzS);
            } else {
                intentZzb = intentZza;
            }
        }
        if (!z4 || this.zze == null || intentZzb == null || !zzl(aVar, zzcfkVar.getContext(), intentZzb.getData().toString(), str)) {
            try {
                ((zzcgu) aVar).zzaJ(new e(intentZzb, this.zzg), z10, z11);
            } catch (ActivityNotFoundException e) {
                h.g(e.getMessage());
            }
        }
    }

    private final void zzk(boolean z4) {
        zzbse zzbseVar = this.zzd;
        if (zzbseVar != null) {
            zzbseVar.zza(z4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b4, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) r6.zza(com.google.android.gms.internal.ads.zzbcn.zzid)).booleanValue() : ((java.lang.Boolean) r6.zza(com.google.android.gms.internal.ads.zzbcn.zzic)).booleanValue()) != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzl(e6.a r10, android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbkd.zzl(e6.a, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm(int i) {
        zzdsm zzdsmVar;
        String str;
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzeE)).booleanValue() || (zzdsmVar = this.zzb) == null) {
            return;
        }
        zzdsl zzdslVarZza = zzdsmVar.zza();
        zzdslVarZza.zzb("action", "cct_action");
        switch (i) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        zzdslVarZza.zzb("cct_open_status", str);
        zzdslVarZza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        e6.a aVar = (e6.a) obj;
        String str = (String) map.get("u");
        Map map2 = new HashMap();
        zzcfk zzcfkVar = (zzcfk) aVar;
        if (zzcfkVar.zzD() != null) {
            map2 = zzcfkVar.zzD().zzaw;
        }
        String strZzc = zzbyx.zzc(str, zzcfkVar.getContext(), true, map2);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            h.g("Action missing from an open GMSG.");
            return;
        }
        b bVar = this.zza;
        if (bVar == null || bVar.b()) {
            zzgei.zzr((((Boolean) t.f3437d.f3440c.zza(zzbcn.zzjI)).booleanValue() && this.zzf != null && zzcnb.zzj(strZzc)) ? this.zzf.zzb(strZzc, s.f3427f.e) : zzgei.zzh(strZzc), new zzbjz(this, map, aVar, str2), this.zzh);
        } else {
            bVar.a(strZzc);
        }
    }
}

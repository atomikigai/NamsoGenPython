package com.google.android.gms.internal.ads;

import e6.h2;
import e6.t;
import h6.o;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfgq {
    public static h2 zza(Throwable th) {
        if (th instanceof zzeff) {
            zzeff zzeffVar = (zzeff) th;
            return zzc(zzeffVar.zza(), zzeffVar.zzb());
        }
        if (th instanceof zzdwn) {
            return th.getMessage() == null ? zzd(((zzdwn) th).zza(), null, null) : zzd(((zzdwn) th).zza(), th.getMessage(), null);
        }
        if (!(th instanceof o)) {
            return zzd(1, null, null);
        }
        o oVar = (o) th;
        return new h2(oVar.f5059a, zzfxf.zzc(oVar.getMessage()), "com.google.android.gms.ads", null, null);
    }

    public static h2 zzb(Throwable th, zzefg zzefgVar) {
        h2 h2Var;
        h2 h2VarZza = zza(th);
        int i = h2VarZza.f3314a;
        if ((i == 3 || i == 0) && (h2Var = h2VarZza.f3317d) != null && !h2Var.f3316c.equals("com.google.android.gms.ads")) {
            h2VarZza.f3317d = null;
        }
        if (zzefgVar != null) {
            h2VarZza.e = zzefgVar.zzb();
        }
        return h2VarZza;
    }

    public static h2 zzc(int i, h2 h2Var) {
        if (i == 0) {
            throw null;
        }
        if (i == 8) {
            if (((Integer) t.f3437d.f3440c.zza(zzbcn.zzhU)).intValue() > 0) {
                return h2Var;
            }
            i = 8;
        }
        return zzd(i, null, h2Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:55:0x00a5  */
    public static h2 zzd(int i, String str, h2 h2Var) {
        String str2;
        int i10 = i - 1;
        if (str == null) {
            if (i == 0) {
                throw null;
            }
            str = "No fill.";
            switch (i10) {
                case 1:
                    str = "Invalid request.";
                    break;
                case 2:
                    break;
                case 3:
                    str = "App ID missing.";
                    break;
                case 4:
                    str = "Network error.";
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    break;
                case 8:
                    str = "The ad is not ready.";
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    break;
                case 12:
                    if (((Integer) t.f3437d.f3440c.zza(zzbcn.zzhX)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                    }
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    break;
                case 14:
                    str = "Invalid ad string.";
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    break;
            }
        }
        String str3 = str;
        if (i == 0) {
            throw null;
        }
        int i11 = 0;
        int i12 = 2;
        switch (i10) {
            case 0:
            case 11:
            case 15:
                i12 = i11;
                return new h2(i12, str3, "com.google.android.gms.ads", h2Var, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i12 = 1;
                return new h2(i12, str3, "com.google.android.gms.ads", h2Var, null);
            case 2:
            case 10:
            case 18:
                i12 = 3;
                return new h2(i12, str3, "com.google.android.gms.ads", h2Var, null);
            case 3:
                i11 = 8;
                i12 = i11;
                return new h2(i12, str3, "com.google.android.gms.ads", h2Var, null);
            case 4:
            case 8:
            case 17:
                return new h2(i12, str3, "com.google.android.gms.ads", h2Var, null);
            case 7:
                i11 = 4;
                i12 = i11;
                return new h2(i12, str3, "com.google.android.gms.ads", h2Var, null);
            case 12:
                if (((Integer) t.f3437d.f3440c.zza(zzbcn.zzhX)).intValue() <= 0) {
                    i11 = 9;
                    i12 = i11;
                } else {
                    i12 = 3;
                }
                return new h2(i12, str3, "com.google.android.gms.ads", h2Var, null);
            case 13:
                i11 = 10;
                i12 = i11;
                return new h2(i12, str3, "com.google.android.gms.ads", h2Var, null);
            case 14:
                i11 = 11;
                i12 = i11;
                return new h2(i12, str3, "com.google.android.gms.ads", h2Var, null);
            default:
                switch (i) {
                    case 1:
                        str2 = "INTERNAL_ERROR";
                        break;
                    case 2:
                        str2 = "INVALID_REQUEST";
                        break;
                    case 3:
                        str2 = "NO_FILL";
                        break;
                    case 4:
                        str2 = "APP_ID_MISSING";
                        break;
                    case 5:
                        str2 = "NETWORK_ERROR";
                        break;
                    case 6:
                        str2 = "INVALID_AD_UNIT_ID";
                        break;
                    case 7:
                        str2 = "INVALID_AD_SIZE";
                        break;
                    case 8:
                        str2 = "MEDIATION_SHOW_ERROR";
                        break;
                    case 9:
                        str2 = "NOT_READY";
                        break;
                    case 10:
                        str2 = "AD_REUSED";
                        break;
                    case 11:
                        str2 = "APP_NOT_FOREGROUND";
                        break;
                    case 12:
                        str2 = "INTERNAL_SHOW_ERROR";
                        break;
                    case 13:
                        str2 = "MEDIATION_NO_FILL";
                        break;
                    case 14:
                        str2 = "REQUEST_ID_MISMATCH";
                        break;
                    case 15:
                        str2 = "INVALID_AD_STRING";
                        break;
                    case 16:
                        str2 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    case 17:
                        str2 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    case 18:
                        str2 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    default:
                        str2 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                }
                throw new AssertionError("Unknown SdkError: ".concat(str2));
        }
    }
}

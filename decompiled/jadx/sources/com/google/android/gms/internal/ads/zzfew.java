package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import e6.t;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import qd.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfew {
    public final List zza;
    public final String zzb;
    public final int zzc;
    public final int zzd;
    public final String zze;
    public final int zzf;
    public final long zzg;
    public final boolean zzh;
    public final String zzi;
    public final zzfev zzj;
    public final Bundle zzk;
    public final String zzl;
    public final String zzm;
    public final String zzn;
    public final JSONObject zzo;
    public final JSONObject zzp;
    public final String zzq;
    public final int zzr;
    public long zzs;
    public long zzt;

    public zzfew(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        List listL = Collections.EMPTY_LIST;
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jsonReader.beginObject();
        String strNextString = "";
        String strNextString2 = "";
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String strNextString5 = strNextString4;
        int iNextInt = 0;
        int iNextInt2 = 0;
        boolean zNextBoolean = false;
        zzfev zzfevVar = null;
        long jZza = -1;
        long jZza2 = -1;
        long jNextLong = 0;
        int iNextInt3 = -1;
        int iMax = 1;
        String strNextString6 = strNextString5;
        String strNextString7 = strNextString6;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (Objects.equals(strNextName, "nofill_urls")) {
                listL = b.L(jsonReader);
            } else if ("refresh_interval".equals(strNextName)) {
                iNextInt = jsonReader.nextInt();
            } else if (Objects.equals(strNextName, "refresh_load_delay_time_interval")) {
                iNextInt3 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(strNextName)) {
                strNextString = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(strNextName)) {
                strNextString6 = jsonReader.nextString();
            } else if ("is_idless".equals(strNextName)) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if ("response_code".equals(strNextName)) {
                iNextInt2 = jsonReader.nextInt();
            } else if ("latency".equals(strNextName)) {
                jNextLong = jsonReader.nextLong();
            } else {
                zzbce zzbceVar = zzbcn.zzhV;
                String str = strNextString3;
                t tVar = t.f3437d;
                JSONObject jSONObject3 = jSONObject2;
                zzbcl zzbclVar = tVar.f3440c;
                zzbcl zzbclVar2 = tVar.f3440c;
                if (((Boolean) zzbclVar.zza(zzbceVar)).booleanValue() && "public_error".equals(strNextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    zzfevVar = new zzfev(jsonReader);
                } else if ("bidding_data".equals(strNextName)) {
                    strNextString7 = jsonReader.nextString();
                } else {
                    if (((Boolean) zzbclVar2.zza(zzbcn.zzkb)).booleanValue() && Objects.equals(strNextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(strNextName)) {
                        strNextString3 = jsonReader.nextString();
                        jSONObject2 = jSONObject3;
                    } else if ("response_info_extras".equals(strNextName)) {
                        if (((Boolean) zzbclVar2.zza(zzbcn.zzgG)).booleanValue()) {
                            try {
                                Bundle bundleF = b.F(b.O(jsonReader));
                                if (bundleF != null) {
                                    bundle = bundleF;
                                }
                            } catch (IOException | JSONException unused) {
                                strNextString3 = str;
                                jSONObject2 = jSONObject3;
                            } catch (IllegalStateException unused2) {
                                jsonReader.skipValue();
                                strNextString3 = str;
                                jSONObject2 = jSONObject3;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(strNextName)) {
                        if (((Boolean) zzbclVar2.zza(zzbcn.zziS)).booleanValue()) {
                            strNextString5 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (!"adRequestUrl".equals(strNextName)) {
                        zzbce zzbceVar2 = zzbcn.zziT;
                        if (((Boolean) zzbclVar2.zza(zzbceVar2)).booleanValue() && Objects.equals(strNextName, "adResponseBody")) {
                            strNextString2 = jsonReader.nextString();
                        } else if (((Boolean) zzbclVar2.zza(zzbceVar2)).booleanValue() && Objects.equals(strNextName, "adResponseHeaders")) {
                            jSONObject = b.O(jsonReader);
                        } else {
                            if (Objects.equals(strNextName, "max_parallel_renderers")) {
                                iMax = Math.max(1, jsonReader.nextInt());
                            } else if (((Boolean) zzbclVar2.zza(zzbcn.zzja)).booleanValue() && Objects.equals(strNextName, "inspector_ad_transaction_extras")) {
                                jSONObject2 = b.O(jsonReader);
                                strNextString3 = str;
                            } else if (((Boolean) zzbclVar2.zza(zzbcn.zzcj)).booleanValue() && Objects.equals(strNextName, "latency_extras")) {
                                try {
                                    Bundle bundleF2 = b.F(b.O(jsonReader));
                                    if (bundleF2 != null) {
                                        jZza2 = zza(bundleF2.getDouble("start_time"));
                                        jZza = zza(bundleF2.getDouble("end_time"));
                                    }
                                } catch (IOException | JSONException unused3) {
                                } catch (IllegalStateException unused4) {
                                    jsonReader.skipValue();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                            strNextString3 = str;
                            jSONObject2 = jSONObject3;
                        }
                    } else if (((Boolean) zzbclVar2.zza(zzbcn.zziS)).booleanValue()) {
                        strNextString4 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    strNextString3 = str;
                    jSONObject2 = jSONObject3;
                }
                strNextString3 = str;
                jSONObject2 = jSONObject3;
            }
        }
        JSONObject jSONObject4 = jSONObject2;
        String str2 = strNextString3;
        jsonReader.endObject();
        this.zza = listL;
        this.zzc = iNextInt;
        if (((Boolean) zzbet.zzd.zze()).booleanValue()) {
            this.zzd = -1;
        } else {
            zzbdx zzbdxVar = zzbeb.zza;
            if (((Long) zzbdxVar.zze()).longValue() > -1) {
                this.zzd = ((Long) zzbdxVar.zze()).intValue();
            } else {
                this.zzd = iNextInt3;
            }
        }
        this.zzb = strNextString;
        this.zze = strNextString6;
        this.zzf = iNextInt2;
        this.zzg = jNextLong;
        this.zzj = zzfevVar;
        this.zzh = zNextBoolean;
        this.zzi = strNextString7;
        this.zzk = bundle;
        this.zzl = strNextString4;
        this.zzm = strNextString5;
        this.zzn = strNextString2;
        this.zzo = jSONObject;
        this.zzp = jSONObject4;
        this.zzq = str2;
        zzbdx zzbdxVar2 = zzber.zza;
        this.zzr = ((Long) zzbdxVar2.zze()).longValue() > 0 ? ((Long) zzbdxVar2.zze()).intValue() : iMax;
        this.zzs = jZza2;
        this.zzt = jZza;
    }

    private static final long zza(double d10) {
        if (d10 > 9.223372036854776E18d || d10 < -9.223372036854776E18d) {
            return -1L;
        }
        return (long) d10;
    }
}

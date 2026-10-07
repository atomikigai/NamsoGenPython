package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import d6.p;
import da.v;
import e6.t;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n7.c;
import org.json.JSONException;
import org.json.JSONObject;
import qd.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzffe {
    public final List zza;
    public final zzfew zzb;
    public final List zzc;
    public final zzbvx zzd;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public zzffe(JsonReader jsonReader, zzbvx zzbvxVar) throws IllegalStateException, JSONException, IOException, NumberFormatException, AssertionError {
        Bundle bundle;
        Bundle bundle2;
        this.zzd = zzbvxVar;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzci)).booleanValue() && zzbvxVar != null && (bundle2 = zzbvxVar.zzm) != null) {
            v.t(p.C.f2983j, bundle2, zzdrv.SERVER_RESPONSE_PARSE_START.zza());
        }
        ?? arrayList = Collections.EMPTY_LIST;
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        zzfew zzfewVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        arrayList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList.add(new zzfet(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        zzfewVar = new zzfew(jsonReader);
                        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzcj)).booleanValue() && zzbvxVar != null && (bundle = zzbvxVar.zzm) != null) {
                            bundle.putLong(zzdrv.NORMALIZATION_AD_RESPONSE_START.zza(), zzfewVar.zzs);
                            zzbvxVar.zzm.putLong(zzdrv.NORMALIZATION_AD_RESPONSE_END.zza(), zzfewVar.zzt);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (strNextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = null;
                    JSONObject jSONObjectO = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if ("name".equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if ("info".equals(strNextName3)) {
                            jSONObjectO = b.O(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList2.add(new zzffd(strNextString, jSONObjectO));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.zzc = arrayList2;
        this.zza = arrayList;
        this.zzb = zzfewVar == null ? new zzfew(new JsonReader(new StringReader("{}"))) : zzfewVar;
    }

    public static zzffe zza(Reader reader, zzbvx zzbvxVar) throws zzfex {
        try {
            try {
                zzffe zzffeVar = new zzffe(new JsonReader(reader), zzbvxVar);
                c.d(reader);
                return zzffeVar;
            } catch (Throwable th) {
                c.d(reader);
                throw th;
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e) {
            throw new zzfex("unable to parse ServerResponse", e);
        }
    }
}

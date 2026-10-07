package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import e6.s3;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import qd.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfet {
    public final zzbye zzA;
    public final String zzB;
    public final JSONObject zzC;
    public final JSONObject zzD;
    public final String zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final int zzQ;
    public final int zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final String zzU;
    public final zzffr zzV;
    public final boolean zzW;
    public final boolean zzX;
    public final int zzY;
    public final String zzZ;
    public final List zza;
    public final int zzaa;
    public final String zzab;
    public final boolean zzac;
    public final zzbtm zzad;
    public final s3 zzae;
    public final String zzaf;
    public final boolean zzag;
    public final JSONObject zzah;
    public final boolean zzai;
    public final JSONObject zzaj;
    public final boolean zzak;
    public final String zzal;
    public final boolean zzam;
    public final String zzan;
    public final String zzao;
    public final String zzap;
    public final boolean zzaq;
    public final boolean zzar;
    public final int zzas;
    public final String zzat;
    public final List zzau;
    public final boolean zzav;
    public final Map zzaw;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final int zze;
    public final List zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final String zzj;
    public final String zzk;
    public final zzbwv zzl;
    public final List zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final int zzq;
    public final List zzr;
    public final zzfey zzs;
    public final List zzt;
    public final List zzu;
    public final JSONObject zzv;
    public final String zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    /* JADX WARN: Code duplicated, block: B:13:0x00e7 A[PHI: r77 r78 r79 r80 r81
      0x00e7: PHI (r77v86 java.util.List) = 
      (r77v68 java.util.List)
      (r77v69 java.util.List)
      (r77v70 java.util.List)
      (r77v71 java.util.List)
      (r77v72 java.util.List)
      (r77v73 java.util.List)
      (r77v74 java.util.List)
      (r77v75 java.util.List)
      (r77v76 java.util.List)
      (r77v77 java.util.List)
      (r77v78 java.util.List)
      (r77v79 java.util.List)
      (r77v80 java.util.List)
      (r77v87 java.util.List)
     binds: [B:127:0x0434, B:124:0x041a, B:121:0x0400, B:118:0x03e6, B:115:0x03cc, B:112:0x03b2, B:109:0x0398, B:106:0x037e, B:103:0x0365, B:100:0x034c, B:97:0x0333, B:94:0x031a, B:87:0x02f2, B:12:0x00e3] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r78v71 java.util.List) = 
      (r78v53 java.util.List)
      (r78v54 java.util.List)
      (r78v55 java.util.List)
      (r78v56 java.util.List)
      (r78v57 java.util.List)
      (r78v58 java.util.List)
      (r78v59 java.util.List)
      (r78v60 java.util.List)
      (r78v61 java.util.List)
      (r78v62 java.util.List)
      (r78v63 java.util.List)
      (r78v64 java.util.List)
      (r78v65 java.util.List)
      (r8v2 java.util.List)
     binds: [B:127:0x0434, B:124:0x041a, B:121:0x0400, B:118:0x03e6, B:115:0x03cc, B:112:0x03b2, B:109:0x0398, B:106:0x037e, B:103:0x0365, B:100:0x034c, B:97:0x0333, B:94:0x031a, B:87:0x02f2, B:12:0x00e3] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r79v85 java.util.List) = 
      (r79v65 java.util.List)
      (r79v66 java.util.List)
      (r79v67 java.util.List)
      (r79v68 java.util.List)
      (r79v69 java.util.List)
      (r79v70 java.util.List)
      (r79v71 java.util.List)
      (r79v72 java.util.List)
      (r79v73 java.util.List)
      (r79v74 java.util.List)
      (r79v75 java.util.List)
      (r79v76 java.util.List)
      (r79v77 java.util.List)
      (r79v86 java.util.List)
     binds: [B:127:0x0434, B:124:0x041a, B:121:0x0400, B:118:0x03e6, B:115:0x03cc, B:112:0x03b2, B:109:0x0398, B:106:0x037e, B:103:0x0365, B:100:0x034c, B:97:0x0333, B:94:0x031a, B:87:0x02f2, B:12:0x00e3] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r80v71 com.google.android.gms.internal.ads.zzbwv) = 
      (r80v51 com.google.android.gms.internal.ads.zzbwv)
      (r80v52 com.google.android.gms.internal.ads.zzbwv)
      (r80v53 com.google.android.gms.internal.ads.zzbwv)
      (r80v54 com.google.android.gms.internal.ads.zzbwv)
      (r80v55 com.google.android.gms.internal.ads.zzbwv)
      (r80v56 com.google.android.gms.internal.ads.zzbwv)
      (r80v57 com.google.android.gms.internal.ads.zzbwv)
      (r80v58 com.google.android.gms.internal.ads.zzbwv)
      (r80v59 com.google.android.gms.internal.ads.zzbwv)
      (r80v60 com.google.android.gms.internal.ads.zzbwv)
      (r80v61 com.google.android.gms.internal.ads.zzbwv)
      (r80v62 com.google.android.gms.internal.ads.zzbwv)
      (r80v63 com.google.android.gms.internal.ads.zzbwv)
      (r80v72 com.google.android.gms.internal.ads.zzbwv)
     binds: [B:127:0x0434, B:124:0x041a, B:121:0x0400, B:118:0x03e6, B:115:0x03cc, B:112:0x03b2, B:109:0x0398, B:106:0x037e, B:103:0x0365, B:100:0x034c, B:97:0x0333, B:94:0x031a, B:87:0x02f2, B:12:0x00e3] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r81v71 java.lang.String) = 
      (r81v51 java.lang.String)
      (r81v52 java.lang.String)
      (r81v53 java.lang.String)
      (r81v54 java.lang.String)
      (r81v55 java.lang.String)
      (r81v56 java.lang.String)
      (r81v57 java.lang.String)
      (r81v58 java.lang.String)
      (r81v59 java.lang.String)
      (r81v60 java.lang.String)
      (r81v61 java.lang.String)
      (r81v62 java.lang.String)
      (r81v63 java.lang.String)
      (r81v72 java.lang.String)
     binds: [B:127:0x0434, B:124:0x041a, B:121:0x0400, B:118:0x03e6, B:115:0x03cc, B:112:0x03b2, B:109:0x0398, B:106:0x037e, B:103:0x0365, B:100:0x034c, B:97:0x0333, B:94:0x031a, B:87:0x02f2, B:12:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:276:0x09cd A[PHI: r10 r77 r78 r79 r80 r81
      0x09cd: PHI (r10v108 android.util.JsonReader) = 
      (r10v48 android.util.JsonReader)
      (r10v49 android.util.JsonReader)
      (r10v50 android.util.JsonReader)
      (r10v51 android.util.JsonReader)
      (r10v52 android.util.JsonReader)
      (r10v53 android.util.JsonReader)
      (r10v54 android.util.JsonReader)
      (r10v55 android.util.JsonReader)
      (r10v56 android.util.JsonReader)
      (r10v57 android.util.JsonReader)
      (r10v58 android.util.JsonReader)
      (r10v60 android.util.JsonReader)
      (r10v61 android.util.JsonReader)
      (r10v62 android.util.JsonReader)
      (r10v63 android.util.JsonReader)
      (r10v64 android.util.JsonReader)
      (r10v65 android.util.JsonReader)
      (r10v66 android.util.JsonReader)
      (r10v67 android.util.JsonReader)
      (r10v68 android.util.JsonReader)
      (r10v69 android.util.JsonReader)
      (r10v70 android.util.JsonReader)
      (r10v72 android.util.JsonReader)
      (r10v73 android.util.JsonReader)
      (r10v75 android.util.JsonReader)
      (r10v76 android.util.JsonReader)
      (r10v77 android.util.JsonReader)
      (r10v79 android.util.JsonReader)
      (r10v80 android.util.JsonReader)
      (r10v81 android.util.JsonReader)
      (r10v82 android.util.JsonReader)
      (r10v84 android.util.JsonReader)
      (r10v85 android.util.JsonReader)
      (r10v86 android.util.JsonReader)
      (r10v87 android.util.JsonReader)
      (r10v88 android.util.JsonReader)
      (r10v89 android.util.JsonReader)
      (r10v90 android.util.JsonReader)
      (r10v91 android.util.JsonReader)
      (r10v92 android.util.JsonReader)
      (r10v93 android.util.JsonReader)
      (r10v94 android.util.JsonReader)
      (r10v95 android.util.JsonReader)
      (r10v96 android.util.JsonReader)
      (r10v97 android.util.JsonReader)
      (r10v98 android.util.JsonReader)
      (r10v101 android.util.JsonReader)
      (r10v109 android.util.JsonReader)
     binds: [B:271:0x09b2, B:268:0x0996, B:265:0x097a, B:262:0x095e, B:259:0x0942, B:256:0x0922, B:253:0x0906, B:247:0x08d7, B:244:0x08bb, B:241:0x089f, B:238:0x087f, B:235:0x0863, B:232:0x0843, B:229:0x0827, B:226:0x080b, B:223:0x07ef, B:220:0x07d3, B:217:0x07b7, B:214:0x079b, B:211:0x077f, B:208:0x0763, B:397:0x09cd, B:202:0x0702, B:199:0x06e5, B:196:0x06c5, B:193:0x06a9, B:190:0x068b, B:187:0x066f, B:184:0x0653, B:181:0x0633, B:396:0x09cd, B:172:0x05e0, B:169:0x05c4, B:166:0x05a8, B:163:0x0588, B:160:0x056c, B:157:0x0550, B:154:0x0534, B:151:0x0518, B:148:0x04fc, B:145:0x04e1, B:142:0x04c5, B:139:0x04a9, B:136:0x048d, B:133:0x0471, B:130:0x0455, B:18:0x0102, B:13:0x00e7] A[DONT_GENERATE, DONT_INLINE]
      0x09cd: PHI (r77v85 java.util.List) = 
      (r77v22 java.util.List)
      (r77v23 java.util.List)
      (r77v24 java.util.List)
      (r77v25 java.util.List)
      (r77v26 java.util.List)
      (r77v27 java.util.List)
      (r77v28 java.util.List)
      (r77v29 java.util.List)
      (r77v30 java.util.List)
      (r77v31 java.util.List)
      (r77v32 java.util.List)
      (r77v33 java.util.List)
      (r77v34 java.util.List)
      (r77v35 java.util.List)
      (r77v36 java.util.List)
      (r77v37 java.util.List)
      (r77v38 java.util.List)
      (r77v39 java.util.List)
      (r77v40 java.util.List)
      (r77v41 java.util.List)
      (r77v42 java.util.List)
      (r77v43 java.util.List)
      (r77v44 java.util.List)
      (r77v45 java.util.List)
      (r77v46 java.util.List)
      (r77v47 java.util.List)
      (r77v48 java.util.List)
      (r77v49 java.util.List)
      (r77v50 java.util.List)
      (r77v51 java.util.List)
      (r77v52 java.util.List)
      (r77v53 java.util.List)
      (r77v54 java.util.List)
      (r77v55 java.util.List)
      (r77v56 java.util.List)
      (r77v57 java.util.List)
      (r77v58 java.util.List)
      (r77v59 java.util.List)
      (r77v60 java.util.List)
      (r77v61 java.util.List)
      (r77v62 java.util.List)
      (r77v63 java.util.List)
      (r77v64 java.util.List)
      (r77v65 java.util.List)
      (r77v66 java.util.List)
      (r77v67 java.util.List)
      (r77v82 java.util.List)
      (r77v86 java.util.List)
     binds: [B:271:0x09b2, B:268:0x0996, B:265:0x097a, B:262:0x095e, B:259:0x0942, B:256:0x0922, B:253:0x0906, B:247:0x08d7, B:244:0x08bb, B:241:0x089f, B:238:0x087f, B:235:0x0863, B:232:0x0843, B:229:0x0827, B:226:0x080b, B:223:0x07ef, B:220:0x07d3, B:217:0x07b7, B:214:0x079b, B:211:0x077f, B:208:0x0763, B:397:0x09cd, B:202:0x0702, B:199:0x06e5, B:196:0x06c5, B:193:0x06a9, B:190:0x068b, B:187:0x066f, B:184:0x0653, B:181:0x0633, B:396:0x09cd, B:172:0x05e0, B:169:0x05c4, B:166:0x05a8, B:163:0x0588, B:160:0x056c, B:157:0x0550, B:154:0x0534, B:151:0x0518, B:148:0x04fc, B:145:0x04e1, B:142:0x04c5, B:139:0x04a9, B:136:0x048d, B:133:0x0471, B:130:0x0455, B:18:0x0102, B:13:0x00e7] A[DONT_GENERATE, DONT_INLINE]
      0x09cd: PHI (r78v70 java.util.List) = 
      (r78v7 java.util.List)
      (r78v8 java.util.List)
      (r78v9 java.util.List)
      (r78v10 java.util.List)
      (r78v11 java.util.List)
      (r78v12 java.util.List)
      (r78v13 java.util.List)
      (r78v14 java.util.List)
      (r78v15 java.util.List)
      (r78v16 java.util.List)
      (r78v17 java.util.List)
      (r78v18 java.util.List)
      (r78v19 java.util.List)
      (r78v20 java.util.List)
      (r78v21 java.util.List)
      (r78v22 java.util.List)
      (r78v23 java.util.List)
      (r78v24 java.util.List)
      (r78v25 java.util.List)
      (r78v26 java.util.List)
      (r78v27 java.util.List)
      (r78v28 java.util.List)
      (r78v29 java.util.List)
      (r78v30 java.util.List)
      (r78v31 java.util.List)
      (r78v32 java.util.List)
      (r78v33 java.util.List)
      (r78v34 java.util.List)
      (r78v35 java.util.List)
      (r78v36 java.util.List)
      (r78v37 java.util.List)
      (r78v38 java.util.List)
      (r78v39 java.util.List)
      (r78v40 java.util.List)
      (r78v41 java.util.List)
      (r78v42 java.util.List)
      (r78v43 java.util.List)
      (r78v44 java.util.List)
      (r78v45 java.util.List)
      (r78v46 java.util.List)
      (r78v47 java.util.List)
      (r78v48 java.util.List)
      (r78v49 java.util.List)
      (r78v50 java.util.List)
      (r78v51 java.util.List)
      (r78v52 java.util.List)
      (r78v67 java.util.List)
      (r78v71 java.util.List)
     binds: [B:271:0x09b2, B:268:0x0996, B:265:0x097a, B:262:0x095e, B:259:0x0942, B:256:0x0922, B:253:0x0906, B:247:0x08d7, B:244:0x08bb, B:241:0x089f, B:238:0x087f, B:235:0x0863, B:232:0x0843, B:229:0x0827, B:226:0x080b, B:223:0x07ef, B:220:0x07d3, B:217:0x07b7, B:214:0x079b, B:211:0x077f, B:208:0x0763, B:397:0x09cd, B:202:0x0702, B:199:0x06e5, B:196:0x06c5, B:193:0x06a9, B:190:0x068b, B:187:0x066f, B:184:0x0653, B:181:0x0633, B:396:0x09cd, B:172:0x05e0, B:169:0x05c4, B:166:0x05a8, B:163:0x0588, B:160:0x056c, B:157:0x0550, B:154:0x0534, B:151:0x0518, B:148:0x04fc, B:145:0x04e1, B:142:0x04c5, B:139:0x04a9, B:136:0x048d, B:133:0x0471, B:130:0x0455, B:18:0x0102, B:13:0x00e7] A[DONT_GENERATE, DONT_INLINE]
      0x09cd: PHI (r79v84 java.util.List) = 
      (r79v19 java.util.List)
      (r79v20 java.util.List)
      (r79v21 java.util.List)
      (r79v22 java.util.List)
      (r79v23 java.util.List)
      (r79v24 java.util.List)
      (r79v25 java.util.List)
      (r79v26 java.util.List)
      (r79v27 java.util.List)
      (r79v28 java.util.List)
      (r79v29 java.util.List)
      (r79v30 java.util.List)
      (r79v31 java.util.List)
      (r79v32 java.util.List)
      (r79v33 java.util.List)
      (r79v34 java.util.List)
      (r79v35 java.util.List)
      (r79v36 java.util.List)
      (r79v37 java.util.List)
      (r79v38 java.util.List)
      (r79v39 java.util.List)
      (r79v40 java.util.List)
      (r79v41 java.util.List)
      (r79v42 java.util.List)
      (r79v43 java.util.List)
      (r79v44 java.util.List)
      (r79v45 java.util.List)
      (r79v46 java.util.List)
      (r79v47 java.util.List)
      (r79v48 java.util.List)
      (r79v49 java.util.List)
      (r79v50 java.util.List)
      (r79v51 java.util.List)
      (r79v52 java.util.List)
      (r79v53 java.util.List)
      (r79v54 java.util.List)
      (r79v55 java.util.List)
      (r79v56 java.util.List)
      (r79v57 java.util.List)
      (r79v58 java.util.List)
      (r79v59 java.util.List)
      (r79v60 java.util.List)
      (r79v61 java.util.List)
      (r79v62 java.util.List)
      (r79v63 java.util.List)
      (r79v64 java.util.List)
      (r79v79 java.util.List)
      (r79v85 java.util.List)
     binds: [B:271:0x09b2, B:268:0x0996, B:265:0x097a, B:262:0x095e, B:259:0x0942, B:256:0x0922, B:253:0x0906, B:247:0x08d7, B:244:0x08bb, B:241:0x089f, B:238:0x087f, B:235:0x0863, B:232:0x0843, B:229:0x0827, B:226:0x080b, B:223:0x07ef, B:220:0x07d3, B:217:0x07b7, B:214:0x079b, B:211:0x077f, B:208:0x0763, B:397:0x09cd, B:202:0x0702, B:199:0x06e5, B:196:0x06c5, B:193:0x06a9, B:190:0x068b, B:187:0x066f, B:184:0x0653, B:181:0x0633, B:396:0x09cd, B:172:0x05e0, B:169:0x05c4, B:166:0x05a8, B:163:0x0588, B:160:0x056c, B:157:0x0550, B:154:0x0534, B:151:0x0518, B:148:0x04fc, B:145:0x04e1, B:142:0x04c5, B:139:0x04a9, B:136:0x048d, B:133:0x0471, B:130:0x0455, B:18:0x0102, B:13:0x00e7] A[DONT_GENERATE, DONT_INLINE]
      0x09cd: PHI (r80v70 com.google.android.gms.internal.ads.zzbwv) = 
      (r80v5 com.google.android.gms.internal.ads.zzbwv)
      (r80v6 com.google.android.gms.internal.ads.zzbwv)
      (r80v7 com.google.android.gms.internal.ads.zzbwv)
      (r80v8 com.google.android.gms.internal.ads.zzbwv)
      (r80v9 com.google.android.gms.internal.ads.zzbwv)
      (r80v10 com.google.android.gms.internal.ads.zzbwv)
      (r80v11 com.google.android.gms.internal.ads.zzbwv)
      (r80v12 com.google.android.gms.internal.ads.zzbwv)
      (r80v13 com.google.android.gms.internal.ads.zzbwv)
      (r80v14 com.google.android.gms.internal.ads.zzbwv)
      (r80v15 com.google.android.gms.internal.ads.zzbwv)
      (r80v16 com.google.android.gms.internal.ads.zzbwv)
      (r80v17 com.google.android.gms.internal.ads.zzbwv)
      (r80v18 com.google.android.gms.internal.ads.zzbwv)
      (r80v19 com.google.android.gms.internal.ads.zzbwv)
      (r80v20 com.google.android.gms.internal.ads.zzbwv)
      (r80v21 com.google.android.gms.internal.ads.zzbwv)
      (r80v22 com.google.android.gms.internal.ads.zzbwv)
      (r80v23 com.google.android.gms.internal.ads.zzbwv)
      (r80v24 com.google.android.gms.internal.ads.zzbwv)
      (r80v25 com.google.android.gms.internal.ads.zzbwv)
      (r80v26 com.google.android.gms.internal.ads.zzbwv)
      (r80v27 com.google.android.gms.internal.ads.zzbwv)
      (r80v28 com.google.android.gms.internal.ads.zzbwv)
      (r80v29 com.google.android.gms.internal.ads.zzbwv)
      (r80v30 com.google.android.gms.internal.ads.zzbwv)
      (r80v31 com.google.android.gms.internal.ads.zzbwv)
      (r80v32 com.google.android.gms.internal.ads.zzbwv)
      (r80v33 com.google.android.gms.internal.ads.zzbwv)
      (r80v34 com.google.android.gms.internal.ads.zzbwv)
      (r80v35 com.google.android.gms.internal.ads.zzbwv)
      (r80v36 com.google.android.gms.internal.ads.zzbwv)
      (r80v37 com.google.android.gms.internal.ads.zzbwv)
      (r80v38 com.google.android.gms.internal.ads.zzbwv)
      (r80v39 com.google.android.gms.internal.ads.zzbwv)
      (r80v40 com.google.android.gms.internal.ads.zzbwv)
      (r80v41 com.google.android.gms.internal.ads.zzbwv)
      (r80v42 com.google.android.gms.internal.ads.zzbwv)
      (r80v43 com.google.android.gms.internal.ads.zzbwv)
      (r80v44 com.google.android.gms.internal.ads.zzbwv)
      (r80v45 com.google.android.gms.internal.ads.zzbwv)
      (r80v46 com.google.android.gms.internal.ads.zzbwv)
      (r80v47 com.google.android.gms.internal.ads.zzbwv)
      (r80v48 com.google.android.gms.internal.ads.zzbwv)
      (r80v49 com.google.android.gms.internal.ads.zzbwv)
      (r80v50 com.google.android.gms.internal.ads.zzbwv)
      (r80v65 com.google.android.gms.internal.ads.zzbwv)
      (r80v71 com.google.android.gms.internal.ads.zzbwv)
     binds: [B:271:0x09b2, B:268:0x0996, B:265:0x097a, B:262:0x095e, B:259:0x0942, B:256:0x0922, B:253:0x0906, B:247:0x08d7, B:244:0x08bb, B:241:0x089f, B:238:0x087f, B:235:0x0863, B:232:0x0843, B:229:0x0827, B:226:0x080b, B:223:0x07ef, B:220:0x07d3, B:217:0x07b7, B:214:0x079b, B:211:0x077f, B:208:0x0763, B:397:0x09cd, B:202:0x0702, B:199:0x06e5, B:196:0x06c5, B:193:0x06a9, B:190:0x068b, B:187:0x066f, B:184:0x0653, B:181:0x0633, B:396:0x09cd, B:172:0x05e0, B:169:0x05c4, B:166:0x05a8, B:163:0x0588, B:160:0x056c, B:157:0x0550, B:154:0x0534, B:151:0x0518, B:148:0x04fc, B:145:0x04e1, B:142:0x04c5, B:139:0x04a9, B:136:0x048d, B:133:0x0471, B:130:0x0455, B:18:0x0102, B:13:0x00e7] A[DONT_GENERATE, DONT_INLINE]
      0x09cd: PHI (r81v70 java.lang.String) = 
      (r81v5 java.lang.String)
      (r81v6 java.lang.String)
      (r81v7 java.lang.String)
      (r81v8 java.lang.String)
      (r81v9 java.lang.String)
      (r81v10 java.lang.String)
      (r81v11 java.lang.String)
      (r81v12 java.lang.String)
      (r81v13 java.lang.String)
      (r81v14 java.lang.String)
      (r81v15 java.lang.String)
      (r81v16 java.lang.String)
      (r81v17 java.lang.String)
      (r81v18 java.lang.String)
      (r81v19 java.lang.String)
      (r81v20 java.lang.String)
      (r81v21 java.lang.String)
      (r81v22 java.lang.String)
      (r81v23 java.lang.String)
      (r81v24 java.lang.String)
      (r81v25 java.lang.String)
      (r81v26 java.lang.String)
      (r81v27 java.lang.String)
      (r81v28 java.lang.String)
      (r81v29 java.lang.String)
      (r81v30 java.lang.String)
      (r81v31 java.lang.String)
      (r81v32 java.lang.String)
      (r81v33 java.lang.String)
      (r81v34 java.lang.String)
      (r81v35 java.lang.String)
      (r81v36 java.lang.String)
      (r81v37 java.lang.String)
      (r81v38 java.lang.String)
      (r81v39 java.lang.String)
      (r81v40 java.lang.String)
      (r81v41 java.lang.String)
      (r81v42 java.lang.String)
      (r81v43 java.lang.String)
      (r81v44 java.lang.String)
      (r81v45 java.lang.String)
      (r81v46 java.lang.String)
      (r81v47 java.lang.String)
      (r81v48 java.lang.String)
      (r81v49 java.lang.String)
      (r81v50 java.lang.String)
      (r81v65 java.lang.String)
      (r81v71 java.lang.String)
     binds: [B:271:0x09b2, B:268:0x0996, B:265:0x097a, B:262:0x095e, B:259:0x0942, B:256:0x0922, B:253:0x0906, B:247:0x08d7, B:244:0x08bb, B:241:0x089f, B:238:0x087f, B:235:0x0863, B:232:0x0843, B:229:0x0827, B:226:0x080b, B:223:0x07ef, B:220:0x07d3, B:217:0x07b7, B:214:0x079b, B:211:0x077f, B:208:0x0763, B:397:0x09cd, B:202:0x0702, B:199:0x06e5, B:196:0x06c5, B:193:0x06a9, B:190:0x068b, B:187:0x066f, B:184:0x0653, B:181:0x0633, B:396:0x09cd, B:172:0x05e0, B:169:0x05c4, B:166:0x05a8, B:163:0x0588, B:160:0x056c, B:157:0x0550, B:154:0x0534, B:151:0x0518, B:148:0x04fc, B:145:0x04e1, B:142:0x04c5, B:139:0x04a9, B:136:0x048d, B:133:0x0471, B:130:0x0455, B:18:0x0102, B:13:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    public zzfet(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        List list;
        List list2;
        String str;
        zzbwv zzbwvVar;
        JsonReader jsonReader2;
        List listL = Collections.EMPTY_LIST;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zzfzo.zzn();
        zzfzo zzfzoVarZzn = zzfzo.zzn();
        HashMap map = new HashMap();
        jsonReader.beginObject();
        List listZza = listL;
        List listL2 = listZza;
        List listZza2 = listL2;
        List listL3 = listZza2;
        JSONObject jSONObjectO = jSONObject;
        JSONObject jSONObjectO2 = jSONObject2;
        JSONObject jSONObjectO3 = jSONObject3;
        JSONObject jSONObjectO4 = jSONObject4;
        JSONObject jSONObjectO5 = jSONObject5;
        JSONObject jSONObjectO6 = jSONObject6;
        List listL4 = zzfzoVarZzn;
        HashMap map2 = map;
        int iZzc = 0;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        boolean zNextBoolean3 = false;
        boolean zNextBoolean4 = false;
        boolean zNextBoolean5 = false;
        boolean zNextBoolean6 = false;
        boolean zNextBoolean7 = false;
        int iNextInt = 0;
        boolean zNextBoolean8 = false;
        boolean zNextBoolean9 = false;
        boolean zNextBoolean10 = false;
        int iNextInt2 = 0;
        boolean zNextBoolean11 = false;
        boolean zNextBoolean12 = false;
        boolean zNextBoolean13 = false;
        boolean zNextBoolean14 = false;
        boolean zNextBoolean15 = false;
        boolean zNextBoolean16 = false;
        boolean zNextBoolean17 = false;
        boolean zNextBoolean18 = false;
        int iNextInt3 = 0;
        boolean zNextBoolean19 = false;
        int iNextInt4 = 0;
        String strNextString = "";
        String strNextString2 = strNextString;
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String string = strNextString4;
        String strNextString5 = string;
        String strNextString6 = strNextString5;
        String strNextString7 = strNextString6;
        String strNextString8 = strNextString7;
        String strNextString9 = strNextString8;
        String strNextString10 = strNextString9;
        String strNextString11 = strNextString10;
        String strNextString12 = strNextString11;
        String strNextString13 = strNextString12;
        String strNextString14 = strNextString13;
        String strNextString15 = strNextString14;
        String strNextString16 = strNextString15;
        String strNextString17 = strNextString16;
        String strNextString18 = strNextString17;
        zzfey zzfeyVar = null;
        zzbye zzbyeVarZza = null;
        zzbtm zzbtmVarZza = null;
        s3 s3Var = null;
        String strNextString19 = null;
        int iZzd = -1;
        int iNextInt5 = -1;
        List listL5 = listL3;
        List listL6 = listL5;
        List listL7 = listL6;
        List listL8 = listL7;
        List listL9 = listL8;
        List listL10 = listL9;
        List listL11 = listL10;
        List listL12 = listL11;
        List listL13 = listL12;
        int iZzb = 0;
        String strNextString20 = strNextString18;
        zzbwv zzbwvVarZza = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            String str2 = strNextName == null ? strNextString : strNextName;
            switch (str2.hashCode()) {
                case -2138196627:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str3 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (!str3.equals("ad_source_instance_name")) {
                        jsonReader2.skipValue();
                    } else if (((Boolean) zzbcn.zzgE.zzj()).booleanValue()) {
                        strNextString13 = jsonReader2.nextString();
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -1980587809:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str4 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str4.equals("debug_signals")) {
                        jSONObjectO2 = b.O(jsonReader2);
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -1965512151:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str5 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str5.equals("omid_settings")) {
                        jSONObjectO4 = b.O(jsonReader2);
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -1871425831:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str6 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str6.equals("recursive_server_response_data")) {
                        strNextString16 = jsonReader2.nextString();
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -1843156475:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str7 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str7.equals("is_consent")) {
                        zNextBoolean18 = jsonReader2.nextBoolean();
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -1812055556:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str8 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str8.equals("play_prewarm_options")) {
                        zzbtmVarZza = zzbtm.zza(b.O(jsonReader2));
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -1785028569:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str9 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str9.equals("parallel_key")) {
                        strNextString18 = jsonReader2.nextString();
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -1776946669:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str10 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (!str10.equals("ad_source_name")) {
                        jsonReader2.skipValue();
                    } else if (((Boolean) zzbcn.zzgE.zzj()).booleanValue()) {
                        strNextString11 = jsonReader2.nextString();
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -1662989631:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str11 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str11.equals("is_interscroller")) {
                        zNextBoolean12 = jsonReader2.nextBoolean();
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -1620470467:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str12 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str12.equals("backend_query_id")) {
                        strNextString8 = jsonReader2.nextString();
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -1550155393:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str13 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str13.equals("nofill_urls")) {
                        listL12 = b.L(jsonReader2);
                        listL13 = list2;
                        listL11 = listL11;
                    } else {
                        jsonReader2.skipValue();
                        listL13 = list2;
                        listL11 = listL11;
                        listL12 = list;
                    }
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -1440104884:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str14 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str14.equals("is_custom_close_blocked")) {
                        zNextBoolean6 = jsonReader2.nextBoolean();
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -1439500848:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str15 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str15.equals("orientation")) {
                        iZzd = zzd(jsonReader2.nextString());
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -1428969291:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str16 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str16.equals("enable_omid")) {
                        zNextBoolean8 = jsonReader2.nextBoolean();
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -1406227629:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str17 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str17.equals("buffer_click_url_as_ready_to_ping")) {
                        zNextBoolean16 = jsonReader2.nextBoolean();
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -1403779768:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str18 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str18.equals("showable_impression_type")) {
                        iNextInt2 = jsonReader2.nextInt();
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -1375413093:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str19 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str19.equals("ad_cover")) {
                        jSONObjectO5 = b.O(jsonReader2);
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -1360811658:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str20 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str20.equals("ad_sizes")) {
                        listZza = zzfeu.zza(jsonReader2);
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -1306015996:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str21 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str21.equals("adapters")) {
                        listL2 = b.L(jsonReader2);
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -1303332046:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str22 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str22.equals("test_mode_enabled")) {
                        zNextBoolean5 = jsonReader2.nextBoolean();
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -1289032093:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str23 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str23.equals("extras")) {
                        jSONObjectO3 = b.O(jsonReader2);
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -1240082064:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str24 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (!str24.equals("ad_event_value")) {
                        jsonReader2.skipValue();
                        listL13 = list2;
                        listL11 = listL11;
                        listL12 = list;
                        zzbwvVarZza = zzbwvVar;
                        strNextString20 = str;
                    } else {
                        JSONObject jSONObjectO7 = b.O(jsonReader2);
                        s3 s3Var2 = new s3(jSONObjectO7.getInt("type_num"), jSONObjectO7.getInt("precision_num"), jSONObjectO7.getLong("value"), jSONObjectO7.getString("currency"));
                        listL13 = list2;
                        listL11 = listL11;
                        listL12 = list;
                        zzbwvVarZza = zzbwvVar;
                        strNextString20 = str;
                        s3Var = s3Var2;
                    }
                    break;
                case -1234181075:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str25 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str25.equals("allow_pub_rendered_attribution")) {
                        zNextBoolean = jsonReader2.nextBoolean();
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -1168140544:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str26 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str26.equals("presentation_error_urls")) {
                        listL13 = b.L(jsonReader2);
                    } else {
                        jsonReader2.skipValue();
                        listL13 = list2;
                    }
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -1152230954:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str27 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str27.equals("ad_type")) {
                        iZzb = zzb(jsonReader2.nextString());
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -1146534047:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str28 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str28.equals("is_scroll_aware")) {
                        zNextBoolean10 = jsonReader2.nextBoolean();
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -1115838944:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str29 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str29.equals("fill_urls")) {
                        listL11 = b.L(jsonReader2);
                        listL13 = list2;
                    } else {
                        jsonReader2.skipValue();
                        listL13 = list2;
                        listL11 = listL11;
                    }
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -1081936678:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str30 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str30.equals("allocation_id")) {
                        strNextString2 = jsonReader2.nextString();
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -1078050970:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str31 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str31.equals("video_complete_urls")) {
                        listL10 = b.L(jsonReader2);
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -1051269058:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str32 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str32.equals("active_view")) {
                        string = b.O(jsonReader2).toString();
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -982608540:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str33 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (!str33.equals("valid_from_timestamp")) {
                        jsonReader2.skipValue();
                        listL13 = list2;
                        listL11 = listL11;
                        listL12 = list;
                        zzbwvVarZza = zzbwvVar;
                        strNextString20 = str;
                    } else {
                        strNextString20 = jsonReader2.nextString();
                        listL13 = list2;
                        listL11 = listL11;
                        listL12 = list;
                        zzbwvVarZza = zzbwvVar;
                    }
                    break;
                case -972056451:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str34 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (!str34.equals("ad_source_instance_id")) {
                        jsonReader2.skipValue();
                    } else if (((Boolean) zzbcn.zzgE.zzj()).booleanValue()) {
                        strNextString14 = jsonReader2.nextString();
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -776859333:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str35 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str35.equals("click_urls")) {
                        listL5 = b.L(jsonReader2);
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -570101180:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str36 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str36.equals("late_load_urls")) {
                        listL4 = b.L(jsonReader2);
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -544216775:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str37 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str37.equals("safe_browsing")) {
                        zzbyeVarZza = zzbye.zza(b.O(jsonReader2));
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -437057161:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str38 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str38.equals("imp_urls")) {
                        listL6 = b.L(jsonReader2);
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -404433734:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str39 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str39.equals("rtb_native_required_assets")) {
                        jSONObjectO6 = b.O(jsonReader2);
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -404326515:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str40 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str40.equals("render_timeout_ms")) {
                        iNextInt = jsonReader2.nextInt();
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -397704715:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str41 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str41.equals("ad_close_time_ms")) {
                        iNextInt5 = jsonReader2.nextInt();
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -388807511:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str42 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str42.equals("content_url")) {
                        strNextString19 = jsonReader2.nextString();
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -369773488:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str43 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str43.equals("is_close_button_enabled")) {
                        jsonReader2.nextBoolean();
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -213449460:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str44 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str44.equals("force_disable_hardware_acceleration")) {
                        zNextBoolean15 = jsonReader2.nextBoolean();
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -213424028:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str45 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str45.equals("watermark")) {
                        strNextString7 = jsonReader2.nextString();
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -180214626:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str46 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str46.equals("native_required_asset_viewability")) {
                        zNextBoolean14 = jsonReader2.nextBoolean();
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -154616268:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str47 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str47.equals("is_offline_ad")) {
                        zNextBoolean13 = jsonReader2.nextBoolean();
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case -29338502:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str48 = str2;
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    if (str48.equals("allow_custom_click_gesture")) {
                        zNextBoolean3 = jsonReader2.nextBoolean();
                    } else {
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case 3107:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str49 = str2;
                    listL11 = listL11;
                    if (str49.equals("ad")) {
                        zzfeyVar = new zzfey(jsonReader);
                    } else {
                        jsonReader2 = jsonReader;
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case 3355:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str50 = str2;
                    listL11 = listL11;
                    if (str50.equals("id")) {
                        strNextString3 = jsonReader.nextString();
                    } else {
                        jsonReader2 = jsonReader;
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case 3076010:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str51 = str2;
                    listL11 = listL11;
                    if (str51.equals("data")) {
                        jSONObjectO = b.O(jsonReader);
                    } else {
                        jsonReader2 = jsonReader;
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case 37109963:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str52 = str2;
                    listL11 = listL11;
                    if (str52.equals("request_id")) {
                        strNextString15 = jsonReader.nextString();
                    } else {
                        jsonReader2 = jsonReader;
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case 63195984:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str53 = str2;
                    listL11 = listL11;
                    if (str53.equals("render_test_label")) {
                        zNextBoolean4 = jsonReader.nextBoolean();
                    } else {
                        jsonReader2 = jsonReader;
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case 107433883:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str54 = str2;
                    listL11 = listL11;
                    if (str54.equals("qdata")) {
                        strNextString4 = jsonReader.nextString();
                    } else {
                        jsonReader2 = jsonReader;
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case 230323073:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str55 = str2;
                    listL11 = listL11;
                    if (str55.equals("ad_load_urls")) {
                        listL7 = b.L(jsonReader);
                    } else {
                        jsonReader2 = jsonReader;
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case 418392395:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str56 = str2;
                    listL11 = listL11;
                    if (str56.equals("is_closable_area_disabled")) {
                        zNextBoolean7 = jsonReader.nextBoolean();
                    } else {
                        jsonReader2 = jsonReader;
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case 542250332:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str57 = str2;
                    listL11 = listL11;
                    if (str57.equals("consent_form_action_identifier")) {
                        iNextInt3 = jsonReader.nextInt();
                    } else {
                        jsonReader2 = jsonReader;
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case 549176928:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str58 = str2;
                    listL11 = listL11;
                    if (str58.equals("presentation_error_timeout_ms")) {
                        iNextInt4 = jsonReader.nextInt();
                    } else {
                        jsonReader2 = jsonReader;
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case 597473788:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str59 = str2;
                    listL11 = listL11;
                    if (str59.equals("debug_dialog_string")) {
                        strNextString5 = jsonReader.nextString();
                    } else {
                        jsonReader2 = jsonReader;
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case 754887508:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str60 = str2;
                    listL11 = listL11;
                    if (str60.equals("container_sizes")) {
                        listZza2 = zzfeu.zza(jsonReader);
                    } else {
                        jsonReader2 = jsonReader;
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case 791122864:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    String str61 = str2;
                    listL11 = listL11;
                    if (str61.equals("impression_type")) {
                        iZzc = zzc(jsonReader.nextInt());
                    } else {
                        jsonReader2 = jsonReader;
                        jsonReader2.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case 805095541:
                    list = listL12;
                    list2 = listL13;
                    if (!str2.equals("analytics_event_name_to_parameters_map")) {
                        str = strNextString20;
                        zzbwvVar = zzbwvVarZza;
                        jsonReader2 = jsonReader;
                        jsonReader2.skipValue();
                    } else if (((Boolean) zzbcn.zzaj.zzj()).booleanValue()) {
                        HashMap map3 = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            List list3 = listL11;
                            HashMap map4 = new HashMap();
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                map4.put(jsonReader.nextName(), jsonReader.nextString());
                                zzbwvVarZza = zzbwvVarZza;
                                strNextString20 = strNextString20;
                            }
                            jsonReader.endObject();
                            map3.put(strNextName2, map4);
                            listL11 = list3;
                        }
                        jsonReader.endObject();
                        map2 = map3;
                        listL13 = list2;
                        listL12 = list;
                    } else {
                        listL11 = listL11;
                        str = strNextString20;
                        zzbwvVar = zzbwvVarZza;
                        jsonReader.skipValue();
                    }
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case 1010584092:
                    list = listL12;
                    list2 = listL13;
                    if (!str2.equals("transaction_id")) {
                        jsonReader2 = jsonReader;
                        listL11 = listL11;
                        str = strNextString20;
                        zzbwvVar = zzbwvVarZza;
                        jsonReader2.skipValue();
                        listL13 = list2;
                        listL11 = listL11;
                        listL12 = list;
                        zzbwvVarZza = zzbwvVar;
                        strNextString20 = str;
                    } else {
                        strNextString = jsonReader.nextString();
                        listL13 = list2;
                        listL12 = list;
                    }
                    break;
                case 1100650276:
                    list = listL12;
                    list2 = listL13;
                    if (!str2.equals("rewards")) {
                        jsonReader2 = jsonReader;
                        listL11 = listL11;
                        str = strNextString20;
                        zzbwvVar = zzbwvVarZza;
                        jsonReader2.skipValue();
                        listL13 = list2;
                        listL11 = listL11;
                        listL12 = list;
                        zzbwvVarZza = zzbwvVar;
                        strNextString20 = str;
                    } else {
                        zzbwvVarZza = zzbwv.zza(b.M(jsonReader));
                        listL13 = list2;
                        listL12 = list;
                    }
                    break;
                case 1141602460:
                    list = listL12;
                    list2 = listL13;
                    if (!str2.equals("adapter_response_info_key")) {
                        jsonReader2 = jsonReader;
                        listL11 = listL11;
                        str = strNextString20;
                        zzbwvVar = zzbwvVarZza;
                        jsonReader2.skipValue();
                        listL13 = list2;
                        listL11 = listL11;
                        listL12 = list;
                        zzbwvVarZza = zzbwvVar;
                        strNextString20 = str;
                    } else {
                        strNextString17 = jsonReader.nextString();
                        listL13 = list2;
                        listL12 = list;
                    }
                    break;
                case 1186014765:
                    list = listL12;
                    list2 = listL13;
                    if (str2.equals("cache_hit_urls")) {
                        b.L(jsonReader);
                        listL11 = listL11;
                        str = strNextString20;
                        zzbwvVar = zzbwvVarZza;
                        listL13 = list2;
                        listL11 = listL11;
                        listL12 = list;
                        zzbwvVarZza = zzbwvVar;
                        strNextString20 = str;
                    }
                    jsonReader2 = jsonReader;
                    listL11 = listL11;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    jsonReader2.skipValue();
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
                case 1321720943:
                    list = listL12;
                    list2 = listL13;
                    if (!str2.equals("allow_pub_owned_ad_view")) {
                        jsonReader2 = jsonReader;
                        listL11 = listL11;
                        str = strNextString20;
                        zzbwvVar = zzbwvVarZza;
                        jsonReader2.skipValue();
                        listL13 = list2;
                        listL11 = listL11;
                        listL12 = list;
                        zzbwvVarZza = zzbwvVar;
                        strNextString20 = str;
                    } else {
                        zNextBoolean2 = jsonReader.nextBoolean();
                        listL13 = list2;
                        listL12 = list;
                    }
                    break;
                case 1422388341:
                    list = listL12;
                    list2 = listL13;
                    if (!str2.equals("is_collapsible")) {
                        jsonReader2 = jsonReader;
                        listL11 = listL11;
                        str = strNextString20;
                        zzbwvVar = zzbwvVarZza;
                        jsonReader2.skipValue();
                        listL13 = list2;
                        listL11 = listL11;
                        listL12 = list;
                        zzbwvVarZza = zzbwvVar;
                        strNextString20 = str;
                    } else {
                        zNextBoolean17 = jsonReader.nextBoolean();
                        listL13 = list2;
                        listL12 = list;
                    }
                    break;
                case 1437255331:
                    list = listL12;
                    list2 = listL13;
                    if (!str2.equals("ad_source_id")) {
                        jsonReader2 = jsonReader;
                        listL11 = listL11;
                        str = strNextString20;
                        zzbwvVar = zzbwvVarZza;
                        jsonReader2.skipValue();
                        listL13 = list2;
                        listL11 = listL11;
                        listL12 = list;
                        zzbwvVarZza = zzbwvVar;
                        strNextString20 = str;
                    } else if (!((Boolean) zzbcn.zzgE.zzj()).booleanValue()) {
                        jsonReader.skipValue();
                        listL11 = listL11;
                        str = strNextString20;
                        zzbwvVar = zzbwvVarZza;
                        listL13 = list2;
                        listL11 = listL11;
                        listL12 = list;
                        zzbwvVarZza = zzbwvVar;
                        strNextString20 = str;
                    } else {
                        strNextString12 = jsonReader.nextString();
                        listL13 = list2;
                        listL12 = list;
                    }
                    break;
                case 1637553475:
                    list = listL12;
                    list2 = listL13;
                    if (!str2.equals("bid_response")) {
                        jsonReader2 = jsonReader;
                        listL11 = listL11;
                        str = strNextString20;
                        zzbwvVar = zzbwvVarZza;
                        jsonReader2.skipValue();
                        listL13 = list2;
                        listL11 = listL11;
                        listL12 = list;
                        zzbwvVarZza = zzbwvVar;
                        strNextString20 = str;
                    } else {
                        strNextString6 = jsonReader.nextString();
                        listL13 = list2;
                        listL12 = list;
                    }
                    break;
                case 1638957285:
                    list = listL12;
                    list2 = listL13;
                    if (!str2.equals("video_start_urls")) {
                        jsonReader2 = jsonReader;
                        listL11 = listL11;
                        str = strNextString20;
                        zzbwvVar = zzbwvVarZza;
                        jsonReader2.skipValue();
                        listL13 = list2;
                        listL11 = listL11;
                        listL12 = list;
                        zzbwvVarZza = zzbwvVar;
                        strNextString20 = str;
                    } else {
                        listL8 = b.L(jsonReader);
                        listL13 = list2;
                        listL12 = list;
                    }
                    break;
                case 1686319423:
                    list = listL12;
                    list2 = listL13;
                    if (!str2.equals("ad_network_class_name")) {
                        jsonReader2 = jsonReader;
                        listL11 = listL11;
                        str = strNextString20;
                        zzbwvVar = zzbwvVarZza;
                        jsonReader2.skipValue();
                        listL13 = list2;
                        listL11 = listL11;
                        listL12 = list;
                        zzbwvVarZza = zzbwvVar;
                        strNextString20 = str;
                    } else {
                        strNextString10 = jsonReader.nextString();
                        listL13 = list2;
                        listL12 = list;
                    }
                    break;
                case 1688341040:
                    list = listL12;
                    list2 = listL13;
                    if (!str2.equals("video_reward_urls")) {
                        jsonReader2 = jsonReader;
                        listL11 = listL11;
                        str = strNextString20;
                        zzbwvVar = zzbwvVarZza;
                        jsonReader2.skipValue();
                        listL13 = list2;
                        listL11 = listL11;
                        listL12 = list;
                        zzbwvVarZza = zzbwvVar;
                        strNextString20 = str;
                    } else {
                        listL9 = b.L(jsonReader);
                        listL13 = list2;
                        listL12 = list;
                    }
                    break;
                case 1799285870:
                    list = listL12;
                    list2 = listL13;
                    if (!str2.equals("use_third_party_container_height")) {
                        jsonReader2 = jsonReader;
                        listL11 = listL11;
                        str = strNextString20;
                        zzbwvVar = zzbwvVarZza;
                        jsonReader2.skipValue();
                        listL13 = list2;
                        listL11 = listL11;
                        listL12 = list;
                        zzbwvVarZza = zzbwvVar;
                        strNextString20 = str;
                    } else {
                        zNextBoolean11 = jsonReader.nextBoolean();
                        listL13 = list2;
                        listL12 = list;
                    }
                    break;
                case 1839650832:
                    list = listL12;
                    list2 = listL13;
                    if (!str2.equals("renderers")) {
                        jsonReader2 = jsonReader;
                        listL11 = listL11;
                        str = strNextString20;
                        zzbwvVar = zzbwvVarZza;
                        jsonReader2.skipValue();
                        listL13 = list2;
                        listL11 = listL11;
                        listL12 = list;
                        zzbwvVarZza = zzbwvVar;
                        strNextString20 = str;
                    } else {
                        listL = b.L(jsonReader);
                        listL13 = list2;
                        listL12 = list;
                    }
                    break;
                case 1875425491:
                    list = listL12;
                    list2 = listL13;
                    if (!str2.equals("is_analytics_logging_enabled")) {
                        jsonReader2 = jsonReader;
                        listL11 = listL11;
                        str = strNextString20;
                        zzbwvVar = zzbwvVarZza;
                        jsonReader2.skipValue();
                        listL13 = list2;
                        listL11 = listL11;
                        listL12 = list;
                        zzbwvVarZza = zzbwvVar;
                        strNextString20 = str;
                    } else {
                        zNextBoolean9 = jsonReader.nextBoolean();
                        listL13 = list2;
                        listL12 = list;
                    }
                    break;
                case 2068142375:
                    list = listL12;
                    list2 = listL13;
                    if (!str2.equals("rule_line_external_id")) {
                        jsonReader2 = jsonReader;
                        listL11 = listL11;
                        str = strNextString20;
                        zzbwvVar = zzbwvVarZza;
                        jsonReader2.skipValue();
                        listL13 = list2;
                        listL11 = listL11;
                        listL12 = list;
                        zzbwvVarZza = zzbwvVar;
                        strNextString20 = str;
                    } else {
                        strNextString9 = jsonReader.nextString();
                        listL13 = list2;
                        listL12 = list;
                    }
                    break;
                case 2072888499:
                    list = listL12;
                    list2 = listL13;
                    if (!str2.equals("manual_tracking_urls")) {
                        jsonReader2 = jsonReader;
                        listL11 = listL11;
                        str = strNextString20;
                        zzbwvVar = zzbwvVarZza;
                        jsonReader2.skipValue();
                        listL13 = list2;
                        listL11 = listL11;
                        listL12 = list;
                        zzbwvVarZza = zzbwvVar;
                        strNextString20 = str;
                    } else {
                        listL3 = b.L(jsonReader);
                        listL13 = list2;
                        listL12 = list;
                    }
                    break;
                case 2075506442:
                    list2 = listL13;
                    list = listL12;
                    if (!str2.equals("render_serially")) {
                        jsonReader2 = jsonReader;
                        listL11 = listL11;
                        str = strNextString20;
                        zzbwvVar = zzbwvVarZza;
                        jsonReader2.skipValue();
                        listL13 = list2;
                        listL11 = listL11;
                        listL12 = list;
                        zzbwvVarZza = zzbwvVar;
                        strNextString20 = str;
                    } else {
                        zNextBoolean19 = jsonReader.nextBoolean();
                        listL13 = list2;
                        listL12 = list;
                    }
                    break;
                default:
                    list = listL12;
                    list2 = listL13;
                    str = strNextString20;
                    zzbwvVar = zzbwvVarZza;
                    jsonReader2 = jsonReader;
                    jsonReader2.skipValue();
                    listL13 = list2;
                    listL11 = listL11;
                    listL12 = list;
                    zzbwvVarZza = zzbwvVar;
                    strNextString20 = str;
                    break;
            }
        }
        jsonReader.endObject();
        this.zza = listL;
        this.zzb = iZzb;
        this.zzc = listL5;
        this.zzd = listL6;
        this.zzf = listL7;
        this.zze = iZzc;
        this.zzg = listL8;
        this.zzh = listL9;
        this.zzi = listL10;
        this.zzj = strNextString;
        this.zzk = strNextString20;
        this.zzl = zzbwvVarZza;
        this.zzm = listL11;
        this.zzn = listL12;
        this.zzo = listL13;
        this.zzp = listL3;
        this.zzq = iNextInt4;
        this.zzr = listZza2;
        this.zzs = zzfeyVar;
        this.zzt = listL2;
        this.zzu = listZza;
        this.zzw = strNextString2;
        this.zzv = jSONObjectO;
        this.zzx = strNextString3;
        this.zzy = strNextString4;
        this.zzz = string;
        this.zzA = zzbyeVarZza;
        this.zzB = strNextString5;
        this.zzC = jSONObjectO2;
        this.zzD = jSONObjectO3;
        this.zzJ = zNextBoolean;
        this.zzK = zNextBoolean2;
        this.zzL = zNextBoolean3;
        this.zzM = zNextBoolean4;
        this.zzN = zNextBoolean5;
        this.zzO = zNextBoolean6;
        this.zzP = zNextBoolean7;
        this.zzQ = iZzd;
        this.zzR = iNextInt;
        this.zzT = zNextBoolean8;
        this.zzU = strNextString6;
        this.zzV = new zzffr(jSONObjectO4);
        this.zzW = zNextBoolean9;
        this.zzX = zNextBoolean10;
        this.zzY = iNextInt2;
        this.zzZ = strNextString7;
        this.zzaa = iNextInt5;
        this.zzab = strNextString8;
        this.zzac = zNextBoolean11;
        this.zzad = zzbtmVarZza;
        this.zzae = s3Var;
        this.zzaf = strNextString9;
        this.zzag = zNextBoolean12;
        this.zzah = jSONObjectO5;
        this.zzE = strNextString10;
        this.zzF = strNextString11;
        this.zzG = strNextString12;
        this.zzH = strNextString13;
        this.zzI = strNextString14;
        this.zzai = zNextBoolean13;
        this.zzaj = jSONObjectO6;
        this.zzak = zNextBoolean14;
        this.zzal = strNextString19;
        this.zzam = zNextBoolean15;
        this.zzS = zNextBoolean16;
        this.zzan = strNextString15;
        this.zzao = strNextString16;
        this.zzap = strNextString17;
        this.zzaq = zNextBoolean17;
        this.zzar = zNextBoolean18;
        this.zzas = iNextInt3;
        this.zzau = listL4;
        this.zzat = strNextString18;
        this.zzav = zNextBoolean19;
        this.zzaw = map2;
    }

    public static String zza(int i) {
        switch (i) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int zzb(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int zzc(int i) {
        if (i == 0 || i == 1 || i == 3) {
            return i;
        }
        return 0;
    }

    private static final int zzd(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        return "portrait".equalsIgnoreCase(str) ? 7 : -1;
    }
}

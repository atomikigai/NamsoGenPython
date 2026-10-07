package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class zzaqe implements zzapi {
    protected final zzaqg zza;
    private final zzaqd zzb;

    public zzaqe(zzaqd zzaqdVar) {
        zzaqg zzaqgVar = new zzaqg(4096);
        this.zzb = zzaqdVar;
        this.zza = zzaqgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapi
    public zzapl zza(zzapp zzappVar) throws Throwable {
        zzaqn zzaqnVarZza;
        byte[] bArr;
        zzaqr zzaqrVar;
        Map map;
        byte[] byteArray;
        byte[] bArrZzb;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                zzaoy zzaoyVarZzd = zzappVar.zzd();
                if (zzaoyVarZzd == null) {
                    map = Collections.EMPTY_MAP;
                } else {
                    HashMap map2 = new HashMap();
                    String str = zzaoyVarZzd.zzb;
                    if (str != null) {
                        map2.put("If-None-Match", str);
                    }
                    long j4 = zzaoyVarZzd.zzd;
                    if (j4 > 0) {
                        map2.put("If-Modified-Since", zzaqm.zzc(j4));
                    }
                    map = map2;
                }
                zzaqnVarZza = this.zzb.zza(zzappVar, map);
                try {
                    int iZzb = zzaqnVarZza.zzb();
                    List listZzd = zzaqnVarZza.zzd();
                    if (iZzb == 304) {
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        zzaoy zzaoyVarZzd2 = zzappVar.zzd();
                        if (zzaoyVarZzd2 == null) {
                            return new zzapl(304, (byte[]) null, true, jElapsedRealtime2, listZzd);
                        }
                        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                        if (!listZzd.isEmpty()) {
                            Iterator it = listZzd.iterator();
                            while (it.hasNext()) {
                                treeSet.add(((zzaph) it.next()).zza());
                            }
                        }
                        ArrayList arrayList = new ArrayList(listZzd);
                        List list = zzaoyVarZzd2.zzh;
                        if (list != null) {
                            if (!list.isEmpty()) {
                                for (zzaph zzaphVar : zzaoyVarZzd2.zzh) {
                                    if (!treeSet.contains(zzaphVar.zza())) {
                                        arrayList.add(zzaphVar);
                                    }
                                }
                            }
                        } else if (!zzaoyVarZzd2.zzg.isEmpty()) {
                            for (Map.Entry entry : zzaoyVarZzd2.zzg.entrySet()) {
                                if (!treeSet.contains(entry.getKey())) {
                                    arrayList.add(new zzaph((String) entry.getKey(), (String) entry.getValue()));
                                }
                            }
                        }
                        return new zzapl(304, zzaoyVarZzd2.zza, true, jElapsedRealtime2, (List) arrayList);
                    }
                    InputStream inputStreamZzc = zzaqnVarZza.zzc();
                    if (inputStreamZzc != null) {
                        int iZza = zzaqnVarZza.zza();
                        zzaqg zzaqgVar = this.zza;
                        zzaqt zzaqtVar = new zzaqt(zzaqgVar, iZza);
                        try {
                            bArrZzb = zzaqgVar.zzb(1024);
                            while (true) {
                                try {
                                    int i = inputStreamZzc.read(bArrZzb);
                                    if (i == -1) {
                                        break;
                                    }
                                    zzaqtVar.write(bArrZzb, 0, i);
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        inputStreamZzc.close();
                                    } catch (IOException unused) {
                                        zzaqb.zzd("Error occurred when closing InputStream", new Object[0]);
                                    }
                                    zzaqgVar.zza(bArrZzb);
                                    zzaqtVar.close();
                                    throw th;
                                }
                            }
                            byteArray = zzaqtVar.toByteArray();
                            try {
                                inputStreamZzc.close();
                            } catch (IOException unused2) {
                                zzaqb.zzd("Error occurred when closing InputStream", new Object[0]);
                            }
                            zzaqgVar.zza(bArrZzb);
                            zzaqtVar.close();
                        } catch (Throwable th2) {
                            th = th2;
                            bArrZzb = null;
                        }
                    } else {
                        byteArray = new byte[0];
                    }
                    bArr = byteArray;
                    try {
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        if (zzaqb.zzb || jElapsedRealtime3 > 3000) {
                            zzaqb.zza("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", zzappVar, Long.valueOf(jElapsedRealtime3), bArr != null ? Integer.valueOf(bArr.length) : "null", Integer.valueOf(iZzb), Integer.valueOf(zzappVar.zzy().zza()));
                        }
                        if (iZzb < 200 || iZzb > 299) {
                            throw new IOException();
                        }
                        return new zzapl(iZzb, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listZzd);
                    } catch (IOException e) {
                        e = e;
                    }
                } catch (IOException e4) {
                    e = e4;
                    bArr = null;
                }
            } catch (IOException e10) {
                e = e10;
                zzaqnVarZza = null;
            }
            if (e instanceof SocketTimeoutException) {
                zzaqrVar = new zzaqr("socket", new zzapx(), null);
            } else {
                if (e instanceof MalformedURLException) {
                    throw new RuntimeException("Bad URL ".concat(String.valueOf(zzappVar.zzk())), e);
                }
                if (zzaqnVarZza == null) {
                    throw new zzapm(e);
                }
                int iZzb2 = zzaqnVarZza.zzb();
                zzaqb.zzb("Unexpected response code %d for %s", Integer.valueOf(iZzb2), zzappVar.zzk());
                if (bArr != null) {
                    zzapl zzaplVar = new zzapl(iZzb2, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, zzaqnVarZza.zzd());
                    if (iZzb2 != 401 && iZzb2 != 403) {
                        if (iZzb2 < 400 || iZzb2 > 499) {
                            throw new zzapw(zzaplVar);
                        }
                        throw new zzapc(zzaplVar);
                    }
                    zzaqrVar = new zzaqr("auth", new zzaox(zzaplVar), null);
                } else {
                    zzaqrVar = new zzaqr("network", new zzapk(), null);
                }
            }
            zzaqr zzaqrVar2 = zzaqrVar;
            zzapd zzapdVarZzy = zzappVar.zzy();
            int iZzb3 = zzappVar.zzb();
            try {
                zzapdVarZzy.zzc(zzaqrVar2.zzb);
                zzappVar.zzm(zzaqrVar2.zza + "-retry [timeout=" + iZzb3 + "]");
            } catch (zzapy e11) {
                zzappVar.zzm(zzaqrVar2.zza + "-timeout-giveup [timeout=" + iZzb3 + "]");
                throw e11;
            }
        }
    }
}

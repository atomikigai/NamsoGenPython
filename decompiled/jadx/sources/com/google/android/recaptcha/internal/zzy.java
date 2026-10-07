package com.google.android.recaptcha.internal;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import mc.b;
import mc.c;
import pc.o;
import vb.i;
import vb.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzy implements zzh {
    private final Context zza;
    private final String zzb = "rce_";
    private final zzad zzc;

    public zzy(Context context) {
        this.zza = context;
        this.zzc = new zzad(context);
    }

    @Override // com.google.android.recaptcha.internal.zzh
    public final String zza(String str) {
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str)));
        if (file.exists()) {
            return new String(zzad.zza(file), StandardCharsets.UTF_8);
        }
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzh
    public final void zzb() {
        try {
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (File file : fileArrListFiles) {
                    if (o.e0(file.getName(), this.zzb, false)) {
                        arrayList.add(file);
                    }
                }
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((File) obj).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zzh
    public final void zzc(String str, String str2) throws GeneralSecurityException, IOException {
        c cVar = new c('A', 'z');
        ArrayList arrayList = new ArrayList(k.U(cVar));
        Iterator it = cVar.iterator();
        while (true) {
            b bVar = (b) it;
            boolean z4 = bVar.f7105d;
            if (!z4) {
                List listP0 = i.p0(arrayList);
                Collections.shuffle(listP0);
                String strE0 = i.e0(((ArrayList) listP0).subList(0, 8), "", null, null, null, 62);
                File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(strE0)));
                zzad.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
                file.renameTo(new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str))));
                return;
            }
            int i = bVar.e;
            if (i != bVar.f7104c) {
                bVar.e = bVar.f7103b + i;
            } else {
                if (!z4) {
                    throw new NoSuchElementException();
                }
                bVar.f7105d = false;
            }
            arrayList.add(Character.valueOf((char) i));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzh
    public final boolean zzd(String str) {
        try {
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            File file = null;
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (jc.i.a(file2.getName(), this.zzb + str)) {
                        file = file2;
                        break;
                    }
                }
            }
            return file != null;
        } catch (Exception unused) {
        }
    }
}

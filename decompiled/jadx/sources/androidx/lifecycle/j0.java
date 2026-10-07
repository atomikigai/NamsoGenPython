package androidx.lifecycle;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.text.TextPaint;
import app.namso_gen.spacehowen.R;
import java.io.File;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends jc.j implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1058b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j0(ic.a aVar) {
        super(0);
        this.f1057a = 3;
        this.f1058b = (jc.j) aVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ic.a, jc.j] */
    @Override // ic.a
    public final Object a() {
        switch (this.f1057a) {
            case 0:
                return i0.f((androidx.activity.m) this.f1058b);
            case 1:
                SharedPreferences sharedPreferences = ((Context) this.f1058b).getSharedPreferences("coins_prefs", 0);
                jc.i.d(sharedPreferences, "context.getSharedPreferences(sharedPreferencesName, Context.MODE_PRIVATE)");
                return sharedPreferences;
            case 2:
                return (List) this.f1058b;
            case 3:
                try {
                    return (List) ((jc.j) this.f1058b).a();
                } catch (SSLPeerUnverifiedException unused) {
                    return vb.q.f9297a;
                }
            case 4:
                File file = (File) ((c1.b) this.f1058b).a();
                String name = file.getName();
                jc.i.d(name, "getName(...)");
                if (pc.g.y0(name, "").equals("preferences_pb")) {
                    return file;
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            case 5:
                bd.k kVar = ((fd.k) this.f1058b).e;
                jc.i.b(kVar);
                List<Certificate> listA = kVar.a();
                ArrayList arrayList = new ArrayList(vb.k.U(listA));
                for (Certificate certificate : listA) {
                    jc.i.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            case 6:
                TextPaint textPaint = new TextPaint();
                sb.b bVar = (sb.b) this.f1058b;
                textPaint.setAntiAlias(true);
                textPaint.setColor(-1);
                textPaint.setTextSize(bVar.f8464a.getResources().getDimension(R.dimen.cnb_badge_text_size));
                textPaint.setFakeBoldText(true);
                textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
                return textPaint;
            default:
                File file2 = (File) ((z0.y) this.f1058b).f10945a.a();
                String absolutePath = file2.getAbsolutePath();
                synchronized (z0.y.f10944u) {
                    LinkedHashSet linkedHashSet = z0.y.f10943t;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file2 + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    jc.i.d(absolutePath, "it");
                    linkedHashSet.add(absolutePath);
                }
                return file2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(Object obj, int i) {
        super(0);
        this.f1057a = i;
        this.f1058b = obj;
    }
}

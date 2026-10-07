package aa;

import a3.j;
import android.animation.Animator;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.emoji2.text.h;
import androidx.emoji2.text.p;
import androidx.emoji2.text.w;
import androidx.fragment.app.a0;
import androidx.fragment.app.i0;
import androidx.fragment.app.s;
import androidx.work.impl.WorkDatabase_Impl;
import app.namso_gen.spacehowen.R;
import com.firebase.ui.auth.ui.email.WelcomeBackEmailLinkPrompt;
import com.firebase.ui.auth.ui.email.WelcomeBackPasswordPrompt;
import com.firebase.ui.auth.ui.idp.WelcomeBackIdpPrompt;
import com.google.android.gms.internal.ads.zzapt;
import com.google.android.gms.internal.ads.zzapy;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import d4.n;
import da.v;
import f7.m;
import g.u;
import gb.r;
import h0.e;
import j.f;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import k.b0;
import n9.g;
import org.json.JSONException;
import org.json.JSONObject;
import q0.e1;
import q0.h0;
import q0.v0;
import r.k;
import u3.i;
import u3.l;
import w3.x;
import y1.y;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements l, n, SuccessContinuation, OnSuccessListener, Continuation, zzapt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f264c;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f262a = i;
        this.f263b = obj;
        this.f264c = obj2;
    }

    public static void H(Context context, s4.c cVar, int i, int i10, TextView textView) {
        String string;
        c cVar2 = new c(context, cVar, i);
        boolean z4 = i != -1;
        String str = cVar.f8398f;
        String str2 = cVar.f8399r;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (zIsEmpty || zIsEmpty2) {
            string = null;
        } else {
            string = context.getString(i10, z4 ? new Object[]{"%BTN%", "%TOS%", "%PP%"} : new Object[]{"%TOS%", "%PP%"});
        }
        if (string != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            cVar2.f264c = spannableStringBuilder;
            int iIndexOf = spannableStringBuilder.toString().indexOf("%BTN%");
            if (iIndexOf != -1) {
                ((SpannableStringBuilder) cVar2.f264c).replace(iIndexOf, 5 + iIndexOf, (CharSequence) context.getString(i));
            }
            cVar2.G(R.string.fui_terms_of_service, "%TOS%", cVar.f8398f);
            cVar2.G(R.string.fui_privacy_policy, "%PP%", str2);
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText((SpannableStringBuilder) cVar2.f264c);
    }

    public static boolean e(Editable editable, KeyEvent keyEvent, boolean z4) {
        w[] wVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (wVarArr = (w[]) editable.getSpans(selectionStart, selectionEnd, w.class)) != null && wVarArr.length > 0) {
                for (w wVar : wVarArr) {
                    int spanStart = editable.getSpanStart(wVar);
                    int spanEnd = editable.getSpanEnd(wVar);
                    if ((z4 && spanStart == selectionStart) || ((!z4 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean A(CharSequence charSequence, int i, int i10, p pVar) {
        if (pVar.f787c == 0) {
            h hVar = (h) this.f264c;
            f1.a aVarB = pVar.b();
            int iA = aVarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) aVarB.f3578d).getShort(iA + aVarB.f3575a);
            }
            androidx.emoji2.text.d dVar = (androidx.emoji2.text.d) hVar;
            dVar.getClass();
            ThreadLocal threadLocal = androidx.emoji2.text.d.f759b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i < i10) {
                sb2.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = dVar.f760a;
            String string = sb2.toString();
            int i11 = e.f4549a;
            pVar.f787c = h0.d.a(textPaint, string) ? 2 : 1;
        }
        return pVar.f787c == 2;
    }

    public void B(ab.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f272a);
            jSONObject.put("Status", u.e.d(bVar.f273b));
            jSONObject.put("AuthToken", bVar.f274c);
            jSONObject.put("RefreshToken", bVar.f275d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f276f);
            jSONObject.put("ExpiresInSecs", bVar.e);
            jSONObject.put("FisError", bVar.f277g);
            g gVar = (g) this.f264c;
            gVar.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f7359a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(v())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public void C(c3.c cVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f263b;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((c3.b) this.f264c).m(cVar);
            workDatabase_Impl.q();
        } finally {
            workDatabase_Impl.n();
        }
    }

    public void D(j.a aVar) {
        r rVar = (r) this.f263b;
        ((ActionMode.Callback) rVar.f4493a).onDestroyActionMode(rVar.f(aVar));
        u uVar = (u) this.f264c;
        if (uVar.H != null) {
            uVar.f4106w.getDecorView().removeCallbacks(uVar.I);
        }
        if (uVar.G != null) {
            e1 e1Var = uVar.J;
            if (e1Var != null) {
                e1Var.b();
            }
            e1 e1VarA = v0.a(uVar.G);
            e1VarA.a(0.0f);
            uVar.J = e1VarA;
            e1VarA.d(new g.n(this, 2));
        }
        uVar.F = null;
        ViewGroup viewGroup = uVar.L;
        WeakHashMap weakHashMap = v0.f7946a;
        h0.c(viewGroup);
        uVar.M();
    }

    public boolean E(j.a aVar, Menu menu) {
        ViewGroup viewGroup = ((u) this.f264c).L;
        WeakHashMap weakHashMap = v0.f7946a;
        h0.c(viewGroup);
        r rVar = (r) this.f263b;
        ActionMode.Callback callback = (ActionMode.Callback) rVar.f4493a;
        f fVarF = rVar.f(aVar);
        k kVar = (k) rVar.f4496d;
        Menu b0Var = (Menu) kVar.get(menu);
        if (b0Var == null) {
            b0Var = new b0((Context) rVar.f4494b, (k.l) menu);
            kVar.put(menu, b0Var);
        }
        return callback.onPrepareActionMode(fVarF, b0Var);
    }

    public ab.b F() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(v());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i10 = u.e.e(5)[iOptInt];
        if (i10 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        String str = i10 == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new ab.b(strOptString, i10, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void G(int i, String str, String str2) {
        Context context = (Context) this.f263b;
        int iIndexOf = ((SpannableStringBuilder) this.f264c).toString().indexOf(str);
        if (iIndexOf != -1) {
            String string = context.getString(i);
            ((SpannableStringBuilder) this.f264c).replace(iIndexOf, str.length() + iIndexOf, (CharSequence) string);
            ((SpannableStringBuilder) this.f264c).setSpan(new b5.d(context, str2), iIndexOf, string.length() + iIndexOf, 0);
        }
    }

    @Override // d4.n
    public void a(Bitmap bitmap, x3.a aVar) throws IOException {
        IOException iOException = ((p4.e) this.f264c).f7796b;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            aVar.c(bitmap);
            throw iOException;
        }
    }

    public void b(Object obj, String str) {
        ((ArrayList) this.f263b).add(v.u(str, "=", String.valueOf(obj)));
    }

    public void c() {
        String str = (String) this.f263b;
        try {
            ia.b bVar = (ia.b) this.f264c;
            bVar.getClass();
            new File(bVar.f5246b, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    @Override // d4.n
    public void d() {
        d4.w wVar = (d4.w) this.f263b;
        synchronized (wVar) {
            wVar.f2908c = wVar.f2906a.length;
        }
    }

    @Override // u3.l
    public int f(i iVar) {
        return 2;
    }

    public void g(boolean z4) {
        s sVar = ((i0) this.f264c).f889p;
        if (sVar != null) {
            sVar.t().f884k.g(true);
        }
        for (a0 a0Var : (CopyOnWriteArrayList) this.f263b) {
            if (z4) {
                a0Var.getClass();
            } else {
                c cVar = a0Var.f833a;
            }
        }
    }

    public void h(boolean z4) {
        i0 i0Var = (i0) this.f264c;
        androidx.fragment.app.w wVar = i0Var.f887n.f997f;
        s sVar = i0Var.f889p;
        if (sVar != null) {
            sVar.t().f884k.h(true);
        }
        for (a0 a0Var : (CopyOnWriteArrayList) this.f263b) {
            if (z4) {
                a0Var.getClass();
            } else {
                c cVar = a0Var.f833a;
            }
        }
    }

    public void i(boolean z4) {
        s sVar = ((i0) this.f264c).f889p;
        if (sVar != null) {
            sVar.t().f884k.i(true);
        }
        for (a0 a0Var : (CopyOnWriteArrayList) this.f263b) {
            if (z4) {
                a0Var.getClass();
            } else {
                c cVar = a0Var.f833a;
            }
        }
    }

    public void j(boolean z4) {
        s sVar = ((i0) this.f264c).f889p;
        if (sVar != null) {
            sVar.t().f884k.j(true);
        }
        for (a0 a0Var : (CopyOnWriteArrayList) this.f263b) {
            if (z4) {
                a0Var.getClass();
            } else {
                c cVar = a0Var.f833a;
            }
        }
    }

    public void k(boolean z4) {
        s sVar = ((i0) this.f264c).f889p;
        if (sVar != null) {
            sVar.t().f884k.k(true);
        }
        for (a0 a0Var : (CopyOnWriteArrayList) this.f263b) {
            if (z4) {
                a0Var.getClass();
            } else {
                c cVar = a0Var.f833a;
            }
        }
    }

    public void l(boolean z4) {
        s sVar = ((i0) this.f264c).f889p;
        if (sVar != null) {
            sVar.t().f884k.l(true);
        }
        for (a0 a0Var : (CopyOnWriteArrayList) this.f263b) {
            if (z4) {
                a0Var.getClass();
            } else {
                c cVar = a0Var.f833a;
            }
        }
    }

    public void m(boolean z4) {
        i0 i0Var = (i0) this.f264c;
        androidx.fragment.app.w wVar = i0Var.f887n.f997f;
        s sVar = i0Var.f889p;
        if (sVar != null) {
            sVar.t().f884k.m(true);
        }
        for (a0 a0Var : (CopyOnWriteArrayList) this.f263b) {
            if (z4) {
                a0Var.getClass();
            } else {
                c cVar = a0Var.f833a;
            }
        }
    }

    public void n(boolean z4) {
        s sVar = ((i0) this.f264c).f889p;
        if (sVar != null) {
            sVar.t().f884k.n(true);
        }
        for (a0 a0Var : (CopyOnWriteArrayList) this.f263b) {
            if (z4) {
                a0Var.getClass();
            } else {
                c cVar = a0Var.f833a;
            }
        }
    }

    public void o(boolean z4) {
        s sVar = ((i0) this.f264c).f889p;
        if (sVar != null) {
            sVar.t().f884k.o(true);
        }
        for (a0 a0Var : (CopyOnWriteArrayList) this.f263b) {
            if (z4) {
                a0Var.getClass();
            } else {
                c cVar = a0Var.f833a;
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        String str = (String) obj;
        e5.g gVar = (e5.g) this.f264c;
        if (str == null) {
            Log.w("EmailProviderResponseHa", "No providers known for user (" + ((String) this.f263b) + ") this email address may be reserved.");
            gVar.f(s4.h.a(new r4.g(0)));
            return;
        }
        if ("password".equalsIgnoreCase(str)) {
            Application applicationC = gVar.c();
            s4.c cVar = (s4.c) gVar.f2923f;
            r4.i iVarC = new fd.e(new s4.i("password", (String) this.f263b, null, null, null)).c();
            int i = WelcomeBackPasswordPrompt.R;
            gVar.f(s4.h.a(new s4.d(u4.c.t(applicationC, WelcomeBackPasswordPrompt.class, cVar).putExtra("extra_idp_response", iVarC), 104)));
            return;
        }
        if (!"emailLink".equalsIgnoreCase(str)) {
            gVar.f(s4.h.a(new s4.d(WelcomeBackIdpPrompt.z(gVar.c(), (s4.c) gVar.f2923f, new s4.i(str, (String) this.f263b, null, null, null), null), 103)));
            return;
        }
        Application applicationC2 = gVar.c();
        s4.c cVar2 = (s4.c) gVar.f2923f;
        r4.i iVarC2 = new fd.e(new s4.i("emailLink", (String) this.f263b, null, null, null)).c();
        int i10 = WelcomeBackEmailLinkPrompt.O;
        gVar.f(s4.h.a(new s4.d(u4.c.t(applicationC2, WelcomeBackEmailLinkPrompt.class, cVar2).putExtra("extra_idp_response", iVarC2), 112)));
    }

    @Override // u3.c
    public boolean p(Object obj, File file, i iVar) {
        return ((d4.b) this.f264c).p(new d4.c(((BitmapDrawable) ((x) obj).get()).getBitmap(), (x3.a) this.f263b), file, iVar);
    }

    public void q(boolean z4) {
        s sVar = ((i0) this.f264c).f889p;
        if (sVar != null) {
            sVar.t().f884k.q(true);
        }
        for (a0 a0Var : (CopyOnWriteArrayList) this.f263b) {
            if (z4) {
                a0Var.getClass();
            } else {
                c cVar = a0Var.f833a;
            }
        }
    }

    public void r(boolean z4) {
        s sVar = ((i0) this.f264c).f889p;
        if (sVar != null) {
            sVar.t().f884k.r(true);
        }
        for (a0 a0Var : (CopyOnWriteArrayList) this.f263b) {
            if (z4) {
                a0Var.getClass();
            } else {
                c cVar = a0Var.f833a;
            }
        }
    }

    public void s(boolean z4) {
        s sVar = ((i0) this.f264c).f889p;
        if (sVar != null) {
            sVar.t().f884k.s(true);
        }
        for (a0 a0Var : (CopyOnWriteArrayList) this.f263b) {
            if (z4) {
                a0Var.getClass();
            } else {
                c cVar = a0Var.f833a;
            }
        }
    }

    public void t(s sVar, View view, boolean z4) {
        s sVar2 = ((i0) this.f264c).f889p;
        if (sVar2 != null) {
            sVar2.t().f884k.t(sVar, view, true);
        }
        for (a0 a0Var : (CopyOnWriteArrayList) this.f263b) {
            if (z4) {
                a0Var.getClass();
            } else {
                c cVar = a0Var.f833a;
                i0 i0Var = (i0) this.f264c;
                if (sVar == ((s) cVar.f263b)) {
                    c cVar2 = i0Var.f884k;
                    synchronized (((CopyOnWriteArrayList) cVar2.f263b)) {
                        try {
                            int size = ((CopyOnWriteArrayList) cVar2.f263b).size();
                            for (int i = 0; i < size; i++) {
                                if (((a0) ((CopyOnWriteArrayList) cVar2.f263b).get(i)).f833a == cVar) {
                                    ((CopyOnWriteArrayList) cVar2.f263b).remove(i);
                                    break;
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    androidx.viewpager2.adapter.d.k(view, (FrameLayout) cVar.f264c);
                } else {
                    continue;
                }
            }
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Bundle bundle;
        f7.a aVar = (f7.a) this.f263b;
        Bundle bundle2 = (Bundle) this.f264c;
        aVar.getClass();
        return (task.isSuccessful() && (bundle = (Bundle) task.getResult()) != null && bundle.containsKey("google.messenger")) ? aVar.a(bundle2).onSuccessTask(f7.n.f3647a, m.f3646b) : task;
    }

    public String toString() {
        switch (this.f262a) {
            case 11:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f264c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f263b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb2.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u(boolean z4) {
        s sVar = ((i0) this.f264c).f889p;
        if (sVar != null) {
            sVar.t().f884k.u(true);
        }
        for (a0 a0Var : (CopyOnWriteArrayList) this.f263b) {
            if (z4) {
                a0Var.getClass();
            } else {
                c cVar = a0Var.f833a;
            }
        }
    }

    public File v() {
        if (((File) this.f263b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f263b) == null) {
                        g gVar = (g) this.f264c;
                        gVar.a();
                        this.f263b = new File(gVar.f7359a.getFilesDir(), "PersistedInstallation." + ((g) this.f264c).f() + ".json");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (File) this.f263b;
    }

    public ArrayList w(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f263b;
        y yVarD = y.d(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            yVarD.I(1);
        } else {
            yVarD.j(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorX = n9.b.x(workDatabase_Impl, yVarD);
        try {
            ArrayList arrayList = new ArrayList(cursorX.getCount());
            while (cursorX.moveToNext()) {
                arrayList.add(cursorX.getString(0));
            }
            cursorX.close();
            yVarD.g();
            return arrayList;
        } catch (Throwable th) {
            cursorX.close();
            yVarD.g();
            throw th;
        }
    }

    public Long x(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f263b;
        y yVarD = y.d(1, "SELECT long_value FROM Preference where `key`=?");
        yVarD.j(1, str);
        workDatabase_Impl.b();
        Cursor cursorX = n9.b.x(workDatabase_Impl, yVarD);
        try {
            Long lValueOf = null;
            if (cursorX.moveToFirst() && !cursorX.isNull(0)) {
                lValueOf = Long.valueOf(cursorX.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorX.close();
            yVarD.g();
        }
    }

    public String y(String str) {
        String str2 = (String) this.f264c;
        Resources resources = (Resources) this.f263b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public ArrayList z(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f263b;
        y yVarD = y.d(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            yVarD.I(1);
        } else {
            yVarD.j(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorX = n9.b.x(workDatabase_Impl, yVarD);
        try {
            ArrayList arrayList = new ArrayList(cursorX.getCount());
            while (cursorX.moveToNext()) {
                arrayList.add(cursorX.getString(0));
            }
            cursorX.close();
            yVarD.g();
            return arrayList;
        } catch (Throwable th) {
            cursorX.close();
            yVarD.g();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public void zza(zzapy zzapyVar) {
        i6.h.g("Failed to load URL: " + ((String) this.f263b) + "\n" + zzapyVar.toString());
        ((h6.v) this.f264c).zzc(null);
    }

    public /* synthetic */ c(Object obj, int i) {
        this.f262a = i;
        this.f263b = obj;
        this.f264c = null;
    }

    public /* synthetic */ c(Object obj, Object obj2, int i, boolean z4) {
        this.f262a = i;
        this.f264c = obj;
        this.f263b = obj2;
    }

    public c(Context context) {
        this.f262a = 12;
        com.google.android.gms.common.internal.i0.i(context);
        Resources resources = context.getResources();
        this.f263b = resources;
        this.f264c = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public c(IBinder iBinder) throws RemoteException {
        this.f262a = 23;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f263b = new Messenger(iBinder);
            this.f264c = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f264c = new f7.e(iBinder);
            this.f263b = null;
        } else {
            String strValueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", strValueOf.length() != 0 ? "Invalid interface descriptor: ".concat(strValueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        switch (this.f262a) {
            case 16:
                ka.b bVar = (ka.b) obj;
                da.p pVar = ((da.m) this.f264c).e;
                if (bVar == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                    return Tasks.forResult(null);
                }
                return Tasks.whenAll((Task<?>[]) new Task[]{da.p.b(pVar), pVar.f3134m.m(null, (Executor) this.f263b)});
            case 17:
                ka.b bVar2 = (ka.b) obj;
                d6.g gVar = (d6.g) this.f264c;
                if (bVar2 == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
                    return Tasks.forResult(null);
                }
                c cVar = (c) gVar.f2939c;
                c cVar2 = (c) gVar.f2939c;
                da.p.b((da.p) cVar.f264c);
                ((da.p) cVar2.f264c).f3134m.m(null, (Executor) this.f263b);
                ((da.p) cVar2.f264c).f3138q.trySetResult(null);
                return Tasks.forResult(null);
            default:
                return ((da.p) this.f264c).e.e(new d6.g(this, (Boolean) obj, 1, false));
        }
    }

    public /* synthetic */ c(Object obj) {
        this.f262a = 11;
        this.f264c = obj;
        this.f263b = new ArrayList();
    }

    public c(int i) {
        this.f262a = i;
        switch (i) {
            case 20:
                this.f263b = new AtomicInteger();
                this.f264c = new AtomicInteger();
                break;
            default:
                g7.e eVar = g7.e.e;
                this.f263b = new SparseIntArray();
                this.f264c = eVar;
                break;
        }
    }

    public c(WorkDatabase_Impl workDatabase_Impl, int i) {
        this.f262a = i;
        switch (i) {
            case 8:
                this.f263b = workDatabase_Impl;
                this.f264c = new c3.b(workDatabase_Impl, 1);
                break;
            case 9:
                this.f263b = workDatabase_Impl;
                this.f264c = new c3.b(workDatabase_Impl, 3);
                break;
            case 10:
                this.f263b = workDatabase_Impl;
                this.f264c = new c3.b(workDatabase_Impl, 6);
                break;
            default:
                this.f263b = workDatabase_Impl;
                this.f264c = new c3.b(workDatabase_Impl, 0);
                break;
        }
    }

    public c(Context context, s4.c cVar, int i) {
        this.f262a = 6;
        this.f263b = context;
    }

    public c(i0 i0Var) {
        this.f262a = 4;
        this.f263b = new CopyOnWriteArrayList();
        this.f264c = i0Var;
    }

    public c(g gVar) {
        this.f262a = 1;
        this.f264c = gVar;
    }

    public c(j jVar, wa.d dVar, androidx.emoji2.text.d dVar2) {
        this.f262a = 2;
        this.f263b = jVar;
        this.f264c = dVar2;
    }

    public c(ArrayList arrayList, ArrayList arrayList2) {
        this.f262a = 26;
        int size = arrayList.size();
        this.f263b = new int[size];
        this.f264c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f263b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f264c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public c(int i, int i10) {
        this.f262a = 26;
        this.f263b = new int[]{i, i10};
        this.f264c = new float[]{0.0f, 1.0f};
    }

    public c(int i, int i10, int i11) {
        this.f262a = 26;
        this.f263b = new int[]{i, i10, i11};
        this.f264c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public c(EditText editText) {
        this.f262a = 27;
        this.f263b = editText;
        g1.i iVar = new g1.i(editText);
        this.f264c = iVar;
        editText.addTextChangedListener(iVar);
        if (g1.a.f4161b == null) {
            synchronized (g1.a.f4160a) {
                try {
                    if (g1.a.f4161b == null) {
                        g1.a aVar = new g1.a();
                        try {
                            g1.a.f4162c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, g1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        g1.a.f4161b = aVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        editText.setEditableFactory(g1.a.f4161b);
    }

    public c(da.m mVar, Executor executor, String str) {
        this.f262a = 16;
        this.f264c = mVar;
        this.f263b = executor;
    }

    public c(Animator animator) {
        this.f262a = 3;
        this.f263b = null;
        this.f264c = animator;
    }

    public c(androidx.viewpager2.adapter.d dVar, s sVar, FrameLayout frameLayout) {
        this.f262a = 5;
        this.f263b = sVar;
        this.f264c = frameLayout;
    }
}

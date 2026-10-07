package c5;

import a2.d;
import com.google.android.material.textfield.TextInputLayout;
import i2.k;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import ub.i;
import y1.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Serializable f1775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Serializable f1776c;

    public a(TextInputLayout textInputLayout) {
        this.f1775b = "";
        this.f1774a = textInputLayout;
    }

    public k a() {
        v vVar = (v) this.f1774a;
        vVar.a();
        if (((AtomicBoolean) this.f1775b).compareAndSet(false, true)) {
            return (k) ((i) this.f1776c).getValue();
        }
        String strC = c();
        vVar.getClass();
        vVar.a();
        vVar.b();
        return vVar.i().z().k(strC);
    }

    public abstract void b();

    public abstract String c();

    public abstract void d();

    public abstract boolean e(CharSequence charSequence);

    public abstract void f(w8.c cVar);

    public void g(k kVar) {
        jc.i.e(kVar, "statement");
        if (kVar == ((k) ((i) this.f1776c).getValue())) {
            ((AtomicBoolean) this.f1775b).set(false);
        }
    }

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public boolean k(CharSequence charSequence) {
        TextInputLayout textInputLayout = (TextInputLayout) this.f1774a;
        if (((String) this.f1776c) != null && (charSequence == null || charSequence.length() == 0)) {
            textInputLayout.setError((String) this.f1776c);
            return false;
        }
        if (e(charSequence)) {
            textInputLayout.setError("");
            return true;
        }
        textInputLayout.setError((String) this.f1775b);
        return false;
    }

    public a(v vVar) {
        jc.i.e(vVar, "database");
        this.f1774a = vVar;
        this.f1775b = new AtomicBoolean(false);
        this.f1776c = new i(new d(this, 7));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [float[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int[], java.io.Serializable] */
    public a(int i) {
        this.f1775b = new float[i * 2];
        this.f1776c = new int[i];
    }
}

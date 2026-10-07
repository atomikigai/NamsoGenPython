package f2;

import a2.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.fragment.app.t;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import jc.i;
import l.l1;
import l.q;
import n.f;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3583d;
    public Parcelable e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f3584f;

    public /* synthetic */ d(TextView textView) {
        this.e = null;
        this.f3584f = null;
        this.f3580a = false;
        this.f3581b = false;
        this.f3583d = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f3583d;
        Drawable drawableA = u0.c.a(compoundButton);
        if (drawableA != null) {
            if (this.f3580a || this.f3581b) {
                Drawable drawableMutate = drawableA.mutate();
                if (this.f3580a) {
                    i0.b.h(drawableMutate, (ColorStateList) this.e);
                }
                if (this.f3581b) {
                    i0.b.i(drawableMutate, (PorterDuff.Mode) this.f3584f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        q qVar = (q) this.f3583d;
        Drawable checkMarkDrawable = qVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f3580a || this.f3581b) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f3580a) {
                    i0.b.h(drawableMutate, (ColorStateList) this.e);
                }
                if (this.f3581b) {
                    i0.b.i(drawableMutate, (PorterDuff.Mode) this.f3584f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(qVar.getDrawableState());
                }
                qVar.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public Bundle c(String str) {
        if (!this.f3581b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.e;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.e = null;
        return bundle2;
    }

    public c d() {
        String str;
        c cVar;
        Iterator it = ((f) this.f3583d).iterator();
        do {
            n.b bVar = (n.b) it;
            if (!bVar.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            i.d(entry, "components");
            str = (String) entry.getKey();
            cVar = (c) entry.getValue();
        } while (!i.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return cVar;
    }

    public void e(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f3583d;
        Context context = compoundButton.getContext();
        int[] iArr = f.a.f3561m;
        l lVarG = l.G(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) lVarG.f44c;
        v0.k(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) lVarG.f44c, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(com.bumptech.glide.d.r(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(com.bumptech.glide.d.r(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(com.bumptech.glide.d.r(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                u0.b.c(compoundButton, lVarG.t(2));
            }
            if (typedArray.hasValue(3)) {
                u0.b.d(compoundButton, l1.b(typedArray.getInt(3, -1), null));
            }
        } finally {
            lVarG.I();
        }
    }

    public void f(String str, c cVar) {
        Object obj;
        i.e(cVar, "provider");
        f fVar = (f) this.f3583d;
        n.c cVarD = fVar.d(str);
        if (cVarD != null) {
            obj = cVarD.f7121b;
        } else {
            n.c cVar2 = new n.c(str, cVar);
            fVar.f7130d++;
            n.c cVar3 = fVar.f7128b;
            if (cVar3 == null) {
                fVar.f7127a = cVar2;
                fVar.f7128b = cVar2;
            } else {
                cVar3.f7122c = cVar2;
                cVar2.f7123d = cVar3;
                fVar.f7128b = cVar2;
            }
            obj = null;
        }
        if (((c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void g() {
        if (!this.f3582c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        t tVar = (t) this.f3584f;
        if (tVar == null) {
            tVar = new t(this);
        }
        this.f3584f = tVar;
        try {
            androidx.lifecycle.i.class.getDeclaredConstructor(null);
            t tVar2 = (t) this.f3584f;
            if (tVar2 != null) {
                ((LinkedHashSet) tVar2.f988b).add(androidx.lifecycle.i.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + androidx.lifecycle.i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public d() {
        this.f3583d = new f();
        this.f3582c = true;
    }
}

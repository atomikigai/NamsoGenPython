package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f1016a;

    public z(i0 i0Var) {
        this.f1016a = i0Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        o0 o0VarF;
        View view2;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        int id2 = 0;
        i0 i0Var = this.f1016a;
        if (zEquals) {
            FragmentContainerView fragmentContainerView = new FragmentContainerView(context, attributeSet);
            fragmentContainerView.f816d = true;
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i1.a.f5128b);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
            }
            String string = typedArrayObtainStyledAttributes.getString(1);
            typedArrayObtainStyledAttributes.recycle();
            int id3 = fragmentContainerView.getId();
            s sVarX = i0Var.x(id3);
            if (classAttribute != null && sVarX == null) {
                if (id3 <= 0) {
                    throw new IllegalStateException(da.v.i("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                }
                c0 c0VarA = i0Var.A();
                context.getClassLoader();
                s sVarA = c0VarA.a(classAttribute);
                sVarA.N = true;
                v vVar = sVarA.D;
                if ((vVar != null ? vVar.e : null) != null) {
                    sVarA.N = true;
                }
                a aVar = new a(i0Var);
                aVar.f829p = true;
                sVarA.O = fragmentContainerView;
                aVar.h(fragmentContainerView.getId(), sVarA, string, 1);
                aVar.g();
                aVar.f830q.v(aVar, true);
            }
            ArrayList arrayListS = i0Var.f879c.s();
            int size = arrayListS.size();
            while (id2 < size) {
                Object obj = arrayListS.get(id2);
                id2++;
                o0 o0Var = (o0) obj;
                s sVar = o0Var.f949c;
                if (sVar.H == fragmentContainerView.getId() && (view2 = sVar.P) != null && view2.getParent() == null) {
                    sVar.O = fragmentContainerView;
                    o0Var.b();
                }
            }
            return fragmentContainerView;
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, i1.a.f5127a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes2.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(1, -1);
            String string2 = typedArrayObtainStyledAttributes2.getString(2);
            typedArrayObtainStyledAttributes2.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = s.class.isAssignableFrom(c0.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    id2 = view != null ? view.getId() : 0;
                    if (id2 == -1 && resourceId == -1 && string2 == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    s sVarX2 = resourceId != -1 ? i0Var.x(resourceId) : null;
                    if (sVarX2 == null && string2 != null) {
                        sVarX2 = i0Var.y(string2);
                    }
                    if (sVarX2 == null && id2 != -1) {
                        sVarX2 = i0Var.x(id2);
                    }
                    if (sVarX2 == null) {
                        c0 c0VarA2 = i0Var.A();
                        context.getClassLoader();
                        sVarX2 = c0VarA2.a(attributeValue);
                        sVarX2.f984x = true;
                        sVarX2.G = resourceId != 0 ? resourceId : id2;
                        sVarX2.H = id2;
                        sVarX2.I = string2;
                        sVarX2.f985y = true;
                        sVarX2.C = i0Var;
                        v vVar2 = i0Var.f887n;
                        sVarX2.D = vVar2;
                        w wVar = vVar2.f997f;
                        sVarX2.N = true;
                        if ((vVar2 != null ? vVar2.e : null) != null) {
                            sVarX2.N = true;
                        }
                        o0VarF = i0Var.a(sVarX2);
                        if (i0.D(2)) {
                            Log.v("FragmentManager", "Fragment " + sVarX2 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (sVarX2.f985y) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string2 + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                        }
                        sVarX2.f985y = true;
                        sVarX2.C = i0Var;
                        v vVar3 = i0Var.f887n;
                        sVarX2.D = vVar3;
                        w wVar2 = vVar3.f997f;
                        sVarX2.N = true;
                        if ((vVar3 != null ? vVar3.e : null) != null) {
                            sVarX2.N = true;
                        }
                        o0VarF = i0Var.f(sVarX2);
                        if (i0.D(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + sVarX2 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    sVarX2.O = (ViewGroup) view;
                    o0VarF.k();
                    o0VarF.j();
                    View view3 = sVarX2.P;
                    if (view3 == null) {
                        throw new IllegalStateException(da.v.i("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view3.setId(resourceId);
                    }
                    if (sVarX2.P.getTag() == null) {
                        sVarX2.P.setTag(string2);
                    }
                    sVarX2.P.addOnAttachStateChangeListener(new y(this, o0VarF));
                    return sVarX2.P;
                }
            }
        }
        return null;
    }
}

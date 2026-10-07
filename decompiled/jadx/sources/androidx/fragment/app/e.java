package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import app.namso_gen.spacehowen.R;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f862d;
    public aa.c e;

    /* JADX WARN: Code duplicated, block: B:17:0x0027  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba A[Catch: RuntimeException -> 0x00c0, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x00c0, blocks: (B:67:0x00b4, B:69:0x00ba), top: B:80:0x00b4 }] */
    public final aa.c k(Context context) {
        int i;
        aa.c cVar;
        Animator animatorLoadAnimator;
        int i10;
        if (this.f862d) {
            return this.e;
        }
        w0 w0Var = (w0) this.f864a;
        s sVar = w0Var.f1006c;
        boolean z4 = w0Var.f1004a == 2;
        boolean z10 = this.f861c;
        p pVar = sVar.S;
        int i11 = pVar == null ? 0 : pVar.f955f;
        if (z10) {
            if (z4) {
                if (pVar == null) {
                    i = 0;
                } else {
                    i = pVar.f954d;
                }
            } else if (pVar == null) {
                i = 0;
            } else {
                i = pVar.e;
            }
        } else if (z4) {
            if (pVar == null) {
                i = 0;
            } else {
                i = pVar.f952b;
            }
        } else if (pVar == null) {
            i = 0;
        } else {
            i = pVar.f953c;
        }
        sVar.X(0, 0, 0, 0);
        ViewGroup viewGroup = sVar.O;
        aa.c cVar2 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            sVar.O.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = sVar.O;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            if (i == 0 && i11 != 0) {
                if (i11 == 4097) {
                    i10 = z4 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                } else if (i11 == 4099) {
                    i10 = z4 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                } else if (i11 != 8194) {
                    i10 = -1;
                } else {
                    i10 = z4 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                }
                i = i10;
            }
            if (i != 0) {
                boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(i));
                if (zEquals) {
                    try {
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, i);
                        if (animationLoadAnimation != null) {
                            cVar = new aa.c(animationLoadAnimation, 3);
                            cVar2 = cVar;
                        }
                    } catch (Resources.NotFoundException e) {
                        throw e;
                    } catch (RuntimeException unused) {
                        try {
                            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
                            if (animatorLoadAnimator != null) {
                                cVar = new aa.c(animatorLoadAnimator);
                                cVar2 = cVar;
                            }
                        } catch (RuntimeException e4) {
                            if (zEquals) {
                                throw e4;
                            }
                            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, i);
                            if (animationLoadAnimation2 != null) {
                                cVar2 = new aa.c(animationLoadAnimation2, 3);
                            }
                        }
                    }
                } else {
                    animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
                    if (animatorLoadAnimator != null) {
                        cVar = new aa.c(animatorLoadAnimator);
                        cVar2 = cVar;
                    }
                }
            }
        }
        this.e = cVar2;
        this.f862d = true;
        return cVar2;
    }
}

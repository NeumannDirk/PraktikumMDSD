package repository;

import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import simplePalladio.SystemIndependentViewPoint.AbstractRepositoryElement;
import simplePalladio.SystemIndependentViewPoint.Component;
import simplePalladio.SystemIndependentViewPoint.Interface;
import simplePalladio.SystemIndependentViewPoint.Parameter;
import simplePalladio.SystemIndependentViewPoint.RepositoryViewType;
import simplePalladio.SystemIndependentViewPoint.Signature;
import simplePalladio.SystemIndependentViewPoint.Type;

@SuppressWarnings("all")
public class RepositoryGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    this.generate(((RepositoryViewType) _head), fsa);
  }
  
  protected void _generate(final RepositoryViewType r, final IFileSystemAccess fsa) {
    EList<AbstractRepositoryElement> _repositoryElements = r.getRepositoryElements();
    for (final AbstractRepositoryElement aRE : _repositoryElements) {
      this.generate(aRE, fsa);
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package repository;");
    _builder.newLine();
    _builder.append("public class Helper {");
    _builder.newLine();
    {
      final Function1<AbstractRepositoryElement, Boolean> _function = (AbstractRepositoryElement e) -> {
        return Boolean.valueOf((e instanceof Interface));
      };
      final Function1<AbstractRepositoryElement, Interface> _function_1 = (AbstractRepositoryElement e) -> {
        return ((Interface) e);
      };
      Iterable<Interface> _map = IterableExtensions.<AbstractRepositoryElement, Interface>map(IterableExtensions.<AbstractRepositoryElement>filter(r.getRepositoryElements(), _function), _function_1);
      for(final Interface i : _map) {
        _builder.append("\t");
        _builder.append("public static void assertNull(");
        String _name = i.getName();
        _builder.append(_name, "\t");
        _builder.append(" ");
        String _firstLower = StringExtensions.toFirstLower(i.getName());
        _builder.append(_firstLower, "\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("assert(");
        String _firstLower_1 = StringExtensions.toFirstLower(i.getName());
        _builder.append(_firstLower_1, "\t\t");
        _builder.append(" == null);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public static void assertNotNull(");
        String _name_1 = i.getName();
        _builder.append(_name_1, "\t");
        _builder.append(" ");
        String _firstLower_2 = StringExtensions.toFirstLower(i.getName());
        _builder.append(_firstLower_2, "\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("assert(");
        String _firstLower_3 = StringExtensions.toFirstLower(i.getName());
        _builder.append(_firstLower_3, "\t\t");
        _builder.append(" != null);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    fsa.generateFile("repository/Helper.java", _builder);
  }
  
  protected void _generate(final Interface i, final IFileSystemAccess fsa) {
    String _name = i.getName();
    String _plus = (("repository" + "/") + _name);
    String _plus_1 = (_plus + ".java");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package repository;");
    _builder.newLine();
    _builder.append("public interface ");
    String _name_1 = i.getName();
    _builder.append(_name_1);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<Signature> _signatures = i.getSignatures();
      for(final Signature sig : _signatures) {
        _builder.append("\t");
        CharSequence _generate = this.generate(sig);
        _builder.append(_generate, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    fsa.generateFile(_plus_1, _builder);
  }
  
  public CharSequence generate(final Signature s) {
    StringConcatenation _builder = new StringConcatenation();
    String _generate = this.generate(s.getReturnValue());
    _builder.append(_generate);
    _builder.append(" ");
    String _name = s.getName();
    _builder.append(_name);
    _builder.append(" (");
    {
      EList<Parameter> _parameters = s.getParameters();
      boolean _hasElements = false;
      for(final Parameter par : _parameters) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        _builder.append(" ");
        String _generate_1 = this.generate(par.getType());
        _builder.append(_generate_1);
        _builder.append(" ");
        String _name_1 = par.getName();
        _builder.append(_name_1);
      }
    }
    _builder.append(")");
    return _builder;
  }
  
  public String generate(final Type t) {
    String _switchResult = null;
    if (t != null) {
      switch (t) {
        case VOID:
          _switchResult = "void";
          break;
        case BOOLEAN:
          _switchResult = "boolean";
          break;
        case INT:
          _switchResult = "int";
          break;
        case CHAR:
          _switchResult = "char";
          break;
        case FLOAT:
          _switchResult = "float";
          break;
        case DOUBLE:
          _switchResult = "double";
          break;
        case LONG:
          _switchResult = "long";
          break;
        case STRING:
          _switchResult = "String";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  protected void _generate(final Component c, final IFileSystemAccess fsa) {
    String _name = c.getName();
    String _plus = (_name + "/");
    String _name_1 = c.getName();
    String _plus_1 = (_plus + _name_1);
    String _plus_2 = (_plus_1 + "Impl.java");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _name_2 = c.getName();
    _builder.append(_name_2);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<Interface> _providedInterfaces = c.getProvidedInterfaces();
      for(final Interface i : _providedInterfaces) {
        _builder.append("import repository.");
        String _name_3 = i.getName();
        _builder.append(_name_3);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      final Function1<Interface, Boolean> _function = (Interface i_1) -> {
        boolean _contains = c.getProvidedInterfaces().contains(i_1);
        return Boolean.valueOf((!_contains));
      };
      Iterable<Interface> _filter = IterableExtensions.<Interface>filter(c.getRequiredInterfaces(), _function);
      for(final Interface i_1 : _filter) {
        _builder.append("import repository.");
        String _name_4 = i_1.getName();
        _builder.append(_name_4);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isEmpty = c.getRequiredInterfaces().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("import repository.Helper;");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("public class ");
    String _name_5 = c.getName();
    _builder.append(_name_5);
    _builder.append("Impl implements ");
    {
      EList<Interface> _providedInterfaces_1 = c.getProvidedInterfaces();
      boolean _hasElements = false;
      for(final Interface i_2 : _providedInterfaces_1) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        _builder.append(" ");
        String _name_6 = i_2.getName();
        _builder.append(_name_6);
        _builder.append(" ");
      }
    }
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<Interface> _requiredInterfaces = c.getRequiredInterfaces();
      for(final Interface i_3 : _requiredInterfaces) {
        _builder.append("\t");
        _builder.append("private ");
        String _name_7 = i_3.getName();
        _builder.append(_name_7, "\t");
        _builder.append(" ");
        String _firstLower = StringExtensions.toFirstLower(i_3.getName());
        _builder.append(_firstLower, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_8 = c.getName();
    _builder.append(_name_8, "\t");
    _builder.append("Impl() {}");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Interface> _requiredInterfaces_1 = c.getRequiredInterfaces();
      for(final Interface i_4 : _requiredInterfaces_1) {
        _builder.append("\t");
        _builder.append("public void set");
        String _name_9 = i_4.getName();
        _builder.append(_name_9, "\t");
        _builder.append("(");
        String _name_10 = i_4.getName();
        _builder.append(_name_10, "\t");
        _builder.append(" ");
        String _firstLower_1 = StringExtensions.toFirstLower(i_4.getName());
        _builder.append(_firstLower_1, "\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("Helper.assertNull(this.");
        String _firstLower_2 = StringExtensions.toFirstLower(i_4.getName());
        _builder.append(_firstLower_2, "\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("this.");
        String _firstLower_3 = StringExtensions.toFirstLower(i_4.getName());
        _builder.append(_firstLower_3, "\t\t");
        _builder.append(" = ");
        String _firstLower_4 = StringExtensions.toFirstLower(i_4.getName());
        _builder.append(_firstLower_4, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Interface> _providedInterfaces_2 = c.getProvidedInterfaces();
      for(final Interface i_5 : _providedInterfaces_2) {
        {
          EList<Signature> _signatures = i_5.getSignatures();
          for(final Signature s : _signatures) {
            _builder.append("\t");
            _builder.append("//Implementing ");
            String _name_11 = s.getName();
            _builder.append(_name_11, "\t");
            _builder.append(" from interface ");
            String _name_12 = i_5.getName();
            _builder.append(_name_12, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("@Override");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("public ");
            CharSequence _generate = this.generate(s);
            _builder.append(_generate, "\t");
            _builder.append(" {");
            _builder.newLineIfNotEmpty();
            {
              EList<Interface> _requiredInterfaces_2 = c.getRequiredInterfaces();
              for(final Interface ireq : _requiredInterfaces_2) {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("Helper.assertNotNull(this.");
                String _firstLower_5 = StringExtensions.toFirstLower(ireq.getName());
                _builder.append(_firstLower_5, "\t\t");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("//TODO: implement");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    fsa.generateFile(_plus_2, _builder);
  }
  
  protected void _generate(final AbstractRepositoryElement aRE, final IFileSystemAccess fsa) {
  }
  
  public void generate(final EObject c, final IFileSystemAccess fsa) {
    if (c instanceof Component) {
      _generate((Component)c, fsa);
      return;
    } else if (c instanceof Interface) {
      _generate((Interface)c, fsa);
      return;
    } else if (c instanceof AbstractRepositoryElement) {
      _generate((AbstractRepositoryElement)c, fsa);
      return;
    } else if (c instanceof RepositoryViewType) {
      _generate((RepositoryViewType)c, fsa);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(c, fsa).toString());
    }
  }
}
